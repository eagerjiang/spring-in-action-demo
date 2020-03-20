package com.myapp.contoller;

import com.myapp.Spitter;
import com.myapp.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

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
    public String processRegistration(@RequestPart("profilePicture") MultipartFile profilePicture,
                                      @Valid Spitter spitter, Errors errors) throws IOException {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        profilePicture.transferTo(new File("/data/spittr/" + profilePicture.getOriginalFilename()));
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }
}
