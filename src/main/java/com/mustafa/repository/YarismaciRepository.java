package com.mustafa.repository;

import com.mustafa.entity.Yarismaci;
import com.mustafa.utility.RepositoryManager;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long> {
    public YarismaciRepository(){
        super(new Yarismaci());
    }
}
