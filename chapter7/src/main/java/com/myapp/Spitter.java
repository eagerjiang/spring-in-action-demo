package com.myapp;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

/**
 * @author jiangqw
 * @date 2020/2/4 15:26
 */
@Getter
@Setter
public class Spitter {
    private static final Random RANDOM = new Random();

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;
    @NotNull
    @Size(min = 5, max = 16)
    private String username;
    @NotNull
    @Size(min = 5, max = 25)
    private String password;
    private Long id;

    public Spitter(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        id = RANDOM.nextLong();
    }

    public Spitter(long id, String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
}
