package com.mustafa.controller;

import com.mustafa.entity.Puanlama;
import com.mustafa.service.PuanlamaService;

import java.util.List;

public class PuanlamaController {
    private PuanlamaService puanlamaService;

    public void save(Puanlama puanlama){
        puanlamaService.save(puanlama);
    }

    public List<Puanlama> findAll(){
        return puanlamaService.findAll();
    }
}
