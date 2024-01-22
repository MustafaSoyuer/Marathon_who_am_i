package com.mustafa.controller;

import com.mustafa.entity.Soru;
import com.mustafa.service.SoruService;

import java.util.List;

public class SoruController {
    private SoruService soruService;

    public void save(Soru soru){
        soruService.save(soru);
    }
    public List<Soru> findAll(){
        return soruService.findAll();
    }

}
