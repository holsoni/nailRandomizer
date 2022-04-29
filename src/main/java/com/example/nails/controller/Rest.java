package com.example.nails.controller;

import com.example.nails.dao.ManicureDao;
import com.example.nails.model.Manicure;
import com.example.nails.service.ManicureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Rest {

    @Autowired
    ManicureService service;

    @GetMapping("/getAll")
    public List<Manicure> getALL(){
       return service.getAll(); }

    @GetMapping("/start")
    public List<Manicure> start(){
        return service.get3First(); }

    @GetMapping("/getByForm")
    public List<Manicure> getByForm(){
        return service.getByForm("Oval"); }

    @GetMapping("/getByColor/{form}/{color}")
    public List<Manicure> getByColor(@PathVariable("form") String form,@PathVariable("color") String color){
        return service.getByColor(form, color); }

    @GetMapping("/getByDesign/{form}/{color}/{design}")
    public List<Manicure> getByDesign(@PathVariable("form") String form,@PathVariable("color") String color,
                                     @PathVariable("design") String design){
        return service.getByDesign(form, color,design); }


}
