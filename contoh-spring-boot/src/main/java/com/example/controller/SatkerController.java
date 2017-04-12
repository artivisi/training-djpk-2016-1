package com.example.controller;

import com.example.dao.SatkerDao;
import com.example.entity.Satker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

//@RestController
@Controller
public class SatkerController {

    @Autowired private SatkerDao satkerDao;

    @GetMapping("/api/satker")
    @ResponseBody // kalau tidak pakai @RestController harus pakai ini
    public Page<Satker> ambilData(Pageable page){
        return satkerDao.findAll(page);
    }

    @GetMapping("/satker/list")
    public ModelMap daftarSatker(Pageable page){
        ModelMap mm = new ModelMap();
        mm.addAttribute("daftarSatker", satkerDao.findAll(page));
        return mm;
    }

    @GetMapping("/satker/form")
    public ModelMap tampilkanForm(@RequestParam(value="id", required = false) Satker satker){
        ModelMap mm = new ModelMap();
        if(satker == null){
            satker = new Satker();
        }
        mm.addAttribute("satker", satker);
        return mm;
    }

    @PostMapping("/satker/form")
    public String prosesForm(@ModelAttribute @Valid Satker satker, BindingResult error, SessionStatus status){
        if(error.hasErrors()) {
            return "satker/form";
        }
        satkerDao.save(satker);
        status.setComplete();
        return "redirect:list";
    }

    @GetMapping("/api/satker/{id}")
    @ResponseBody
    public Satker cariById(@PathVariable("id") Satker sk){
        /* sudah otomatis dihandle spring, tidak perlu bikin sendiri
        if(header.equals("xml")){
            String xml = konversiKeXml(sk);
            return xml;
        } else if(header.equals("json")) {
            String json = konversiKeJson(sk);
            return json;
        }
        */
        return sk;
    }

    @PostMapping("/api/satker")
    @ResponseStatus(HttpStatus.CREATED)
    public void simpanData(@RequestBody Satker satker){
        satkerDao.save(satker);
    }
}
