package com.mustafa.controller;

import com.mustafa.entity.Yarismaci;
import com.mustafa.service.YarismaciService;

import java.util.List;

public class YarismaciController {
    private YarismaciService yarismaciService;

    public void save(Yarismaci yarismaci){
        yarismaciService.save(yarismaci);
    }

    public List<Yarismaci> findAll(){
        return yarismaciService.findAll();
    }

}
