package com.mustafa.repository;

import com.mustafa.entity.Soru;
import com.mustafa.utility.RepositoryManager;

public class SoruRepository extends RepositoryManager<Soru,Long> {
    public SoruRepository(){
        super(new Soru());
    }
}
