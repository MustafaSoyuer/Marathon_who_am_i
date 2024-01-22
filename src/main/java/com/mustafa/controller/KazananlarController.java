package com.mustafa.controller;

import com.mustafa.entity.Kazananlar;
import com.mustafa.service.KazananlarService;

import java.util.List;

public class KazananlarController {
    private KazananlarService kazananlarService;

    public void save(Kazananlar kazananlar){
        kazananlarService.save(kazananlar);
    }

    public List<Kazananlar> findAll(){
        return kazananlarService.findAll();
    }
}
