package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddingTwoNumbersInPostController {
	
	@GetMapping("/math/add")
    public String twoNumberForm(Model model) {
        model.addAttribute("TwoNumberForm", new AddingTwoNumbers());
        return "TwoNumberForm";
    }
	
	@PostMapping("/math/add")
    public String twoNumberSubmit(@ModelAttribute AddingTwoNumbers addingTwoNumbers) {
        return "TwoNumberResult";
    }
}
