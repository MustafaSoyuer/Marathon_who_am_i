package com.mustafa.controller;


import com.mustafa.entity.UnluBilgileri;
import com.mustafa.service.UnluBilgileriService;

import java.util.List;

public class UnluBilgileriController {
    private UnluBilgileriService unluBilgileriService;

    public void save(UnluBilgileri unluBilgileri){
        unluBilgileriService.save(unluBilgileri);
    }
    public List<UnluBilgileri> findAll(){
        return unluBilgileriService.findAll();
    }
}
