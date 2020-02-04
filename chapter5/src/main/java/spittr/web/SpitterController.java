package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;

/**
 * @author jiangqw
 * @date 2020/2/4 14:15
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
    @Autowired
    private SpitterRepository spitterRepository;

    @GetMapping(value = "/register")
    public String showRegistrationForm() {
        return "registerForm";
    }

    @PostMapping(value = "/register")
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }
}
