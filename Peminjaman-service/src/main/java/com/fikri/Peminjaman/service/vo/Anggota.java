/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.peminjaman.service.vo;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fikri
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Anggota {
    private Long anggotaId;
    private String anggotaName;
    private String anggotaAddress;
}
