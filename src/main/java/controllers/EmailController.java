package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ValidateService;

@Controller
@RequestMapping("/email")
public class EmailController {
    @PostMapping("/register")
    public ModelAndView validate(@RequestParam String email) {
        ValidateService validateService = new ValidateService();
        boolean isEmail = validateService.validateEmail(email);
        ModelAndView modelAndView = new ModelAndView("index");
        if (isEmail) {
            modelAndView.addObject("message", "successfully !!  your email : " + email);
        } else {
            modelAndView.addObject("message", "not email");
        }
        return modelAndView;
    }
}
