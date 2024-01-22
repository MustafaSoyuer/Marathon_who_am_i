package com.mustafa.repository;

import com.mustafa.entity.Puanlama;
import com.mustafa.utility.RepositoryManager;

public class PuanlamaRepository extends RepositoryManager<Puanlama,Long> {
    public PuanlamaRepository(){
        super(new Puanlama());
    }
}
