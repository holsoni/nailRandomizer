package com.example.nails.controller;

import com.example.nails.dao.ManicureDao;
import com.example.nails.model.Manicure;
import com.example.nails.service.ManicureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/randomManicure")
public class MainController {

    @Autowired
    ManicureService service;

    Manicure neededManicure = new Manicure();

    @RequestMapping
    public String start(Model model){
        List<Manicure> manicures3First = service.get3First();
        model.addAttribute("manicure3first", manicures3First);
        return "start-page";
    }

    @GetMapping("/getByForm/{form}")
    public String getByForm(@PathVariable(value = "form") String form, Model model){
        this.service.getByForm(form);
        neededManicure.setForm(form);
        List<Manicure> manicuresWithForm = service.getByForm(form);
        model.addAttribute("manicuresWithForm", manicuresWithForm);
        return "redirect:/randomManicure/chooseColor";
    }

    @RequestMapping("/chooseColor")
    public String chooseColor(Model model){
        List<Manicure> manicuresWithForm = service.getByForm(neededManicure.getForm());
        model.addAttribute("manicuresWithForm", manicuresWithForm);
        return "color-page";
    }

    @GetMapping("/getByColor/{color}")
    public String getByColor(@PathVariable(value = "color") String color, Model model){
        this.service.getByColor(neededManicure.getForm(),color);
        neededManicure.setColor(color);
        List<Manicure> manicuresWithColor = service.getByColor(neededManicure.getForm(),color);
        model.addAttribute("manicuresWithColor", manicuresWithColor);
        return "redirect:/randomManicure/chooseDesign";
    }

    @RequestMapping("/chooseDesign")
    public String chooseDesign(Model model){
        List<Manicure> manicuresWithColor = service.getByColor(neededManicure.getForm(), neededManicure.getColor());
        model.addAttribute("manicuresWithColor", manicuresWithColor);
        return "design-page";
    }

    @GetMapping("/getByDesign/{design}")
    public String getByDesign(@PathVariable(value = "design") String design, Model model){
        this.service.getRandom(neededManicure.getForm(), neededManicure.getColor(),design);
        neededManicure.setDesign(design);
        List<Manicure> manicuresWithDesign = service.getRandom(neededManicure.getForm(), neededManicure.getColor(),design);
        model.addAttribute("manicuresWithDesign", manicuresWithDesign);
        return "redirect:/randomManicure/showResult";
    }

    @GetMapping("/showResult")
    public String showResult( Model model){
        List<Manicure> result = service.getRandom(neededManicure.getForm(), neededManicure.getColor(), neededManicure.getDesign());
        model.addAttribute("result", result);
        return "result-page";
    }




}
