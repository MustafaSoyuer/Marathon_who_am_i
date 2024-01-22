package com.mustafa.repository;

import com.mustafa.entity.UnluKisi;
import com.mustafa.utility.RepositoryManager;

public class UnluKisiRepository extends RepositoryManager<UnluKisi,Long> {
    public UnluKisiRepository(){
        super(new UnluKisi());
    }
}
