/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.nasabah.service.Service;

import com.fikri.Nasabah.service.Entity.Nasabah;
import com.fikri.nasabah.service.Repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author fikri
 */
@Service

public class NasabahService {
    @Autowired
    private NasabahRepository nasabahRepository;
    
    public Nasabah saveNasabah(Nasabah nasabah) {
        return nasabahRepository.save(nasabah);
    }
    
    public Nasabah findNasabahById(Long nasabahId){
        return nasabahRepository.findByNasabahId(nasabahId);
    }
}