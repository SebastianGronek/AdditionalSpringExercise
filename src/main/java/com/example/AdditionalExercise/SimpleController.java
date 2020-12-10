package com.example.AdditionalExercise;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SimpleController {

    @GetMapping("/greeting")
    public String get(Model model) {
        model.addAttribute("name", new Name());
        return "addName";
    }

    @PostMapping("/greeting") // url , endpoint w formularzu w polu th:action
    public String post(@ModelAttribute Name name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
