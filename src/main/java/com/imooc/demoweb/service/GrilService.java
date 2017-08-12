package com.imooc.demoweb.service;

import com.imooc.demoweb.domain.Gril;
import com.imooc.demoweb.repository.GrilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GrilService {

    @Autowired
    private GrilRepository grilRepository;

    @Transactional  //事务操作，对多条任务的并行进行操作，同时失败或者同时成功
    public void inserTo(){
        Gril grilA=new Gril();
        grilA.setAge(22);
        grilA.setCupSize("D");
        grilRepository.save(grilA);

        Gril grilB=new Gril();
        grilB.setAge(15);
        grilB.setCupSize("AAAA");
        grilRepository.save(grilB);
    }
}
