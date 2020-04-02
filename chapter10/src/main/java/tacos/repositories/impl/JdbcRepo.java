package tacos.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tacos.Ingredient;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jiangqw
 * @date 4/2/2020 3:27 PM
 */
@Repository
public class JdbcRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Ingredient findOne(String id) {
        return jdbcTemplate.queryForObject("select id, name, type from Ingredient where id=?",
                this::mapRowToIngredient, id);
    }

    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum)
            throws SQLException {
        return new Ingredient(
                rs.getString("id"),
                rs.getString("name"),
                Ingredient.Type.valueOf(rs.getString("type")));
    }
}
