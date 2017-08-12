package com.imooc.demoweb.controller;

import com.imooc.demoweb.repository.GrilRepository;
import com.imooc.demoweb.domain.Gril;
import com.imooc.demoweb.service.GrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GrilController {

    @Autowired
    private GrilRepository grilRepository;

    @Autowired
    private GrilService grilService;
    /*
    * 查询所有女生
    * @return
    * */
    @GetMapping(value = "/gril")
    public List<Gril> grilList(){
        return grilRepository.findAll();//返回所有数据结果
    }

    @PostMapping(value = "griladd")
    public Gril grilAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Gril gril=new Gril();
        gril.setCupSize(cupSize);
        gril.setAge(age);
        return grilRepository.save(gril);//添加数据
    }

    /**
     * 查找数据
     *
     */
    @GetMapping(value = "/grilser/{id}")
    public Gril grilSearch(@PathVariable("id") Integer id){
        return grilRepository.findOne(id);
    }
    /**
     * 更新数据
     *
     */
    @PutMapping(value = "/grilup/{id}")
    public Gril grilUpdate(@PathVariable("id")Integer id,@RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Gril gril=new Gril();
        gril.setId(id);
        gril.setAge(age);
        gril.setCupSize(cupSize);
        return grilRepository.save(gril);
    }
    /**
     * 删除数据
     *
     */
    @DeleteMapping(value = "/grildell/{id}")
    public void grilDell(@PathVariable("id") Integer id){
        grilRepository.delete(id);
    }

    @GetMapping(value = "/grils")
    public void insertTO(){
        grilService.inserTo();
    }
}
