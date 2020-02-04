package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author jiangqw
 * @date 2020/2/4 14:30
 */
public class SpitterControllerTest {
    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterController spitterController = new SpitterController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spitterController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register"))
                .andExpect(MockMvcResultMatchers.view().name("registerForm"));
    }
}
