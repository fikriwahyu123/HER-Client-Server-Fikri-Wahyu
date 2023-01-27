/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.anggotaservice.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fikri
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anggotaId;
    private String anggotaName;
    private String anggotaAddress;
}
