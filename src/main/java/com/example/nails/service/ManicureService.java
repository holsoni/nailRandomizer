package com.example.nails.service;

import com.example.nails.dao.ManicureDao;
import com.example.nails.model.Manicure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ManicureService {

    Random random = new Random();
    @Autowired
    ManicureDao dao;

    public List<Manicure> getAll(){
        return dao.getAll();
    }

    public List<Manicure> getByForm(String form){
        return dao.get3RandomByForm(form);
    }
    public List<Manicure> getByColor(String form, String color){
        return dao.get3RandomByColor(form,color);
    }
    public List<Manicure> getRandom(String form, String color, String design){
        return dao.getRandom(form,color, design);
    }
    public List<Manicure> get3First(){
        return dao.get3First();
    }




}
