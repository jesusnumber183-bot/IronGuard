package com.ironguard.kennels.controllers;

import com.ironguard.kennels.models.Dog;
import com.ironguard.kennels.models.KennelInfo;
import com.ironguard.kennels.models.Litter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("activeTab", "home");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        KennelInfo info = new KennelInfo(
                "Founded in 2015 to breed high-quality working dogs.",
                "We prioritize health, temperament, and loyalty.",
                "Contact us at info@ironguardkennels.com"
        );
        model.addAttribute("info", info);
        model.addAttribute("activeTab", "about");
        return "about";
    }

    @GetMapping("/dogs")
    public String dogs(Model model) {
        List<Dog> dogs = List.of(
                new Dog("Ryker", "Presa Canario", "Intelligent, brave, and powerful",
                        List.of("/images/ryker1.jpg", "/images/ryker2.jpg", "/images/ryker3.jpg")),
                new Dog("Serabi", "Presa Canario", "Agile and intelligent",
                        List.of("/images/serabi1.jpg", "/images/serabi2.jpg")),
                new Dog("Toph", "Presa Canario", "Strong and loyal",
                        List.of("/images/TOPH 1.jpg", "/images/toph 2.jpg")),
                new Dog("Misande", "Presa Canario", "Gentle and protective",
                        List.of("/images/Sunday 1.jpg", "/images/Sunday 2.jpg", "/images/Sunday 3.jpg", "/images/Sunday 4.jpg"))
        );
        model.addAttribute("dogs", dogs);
        model.addAttribute("activeTab", "dogs");
        return "dogs";
    }

    @GetMapping("/litters")
    public String litters(Model model) {
        List<Litter> litters = List.of(
                new Litter("September 2025", "", "Toph", "Presa Canario"),
                new Litter("October 2025", "", "Massandei", "Presa Canario")
        );
        model.addAttribute("litters", litters);
        model.addAttribute("activeTab", "litters");
        return "litters";
    }
}