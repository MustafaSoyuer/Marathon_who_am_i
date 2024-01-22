package com.mustafa.controller;


import com.mustafa.entity.UnluKisi;
import com.mustafa.service.UnluKisiService;

import java.util.List;

public class UnluKisiController {
    private UnluKisiService unluKisiService;

    public void save(UnluKisi unluKisi){
        unluKisiService.save(unluKisi);
    }

    public List<UnluKisi> findAll(){
        return unluKisiService.findAll();
    }
}
