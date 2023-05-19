/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.atividade03;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Fisica fisica = new Fisica("987.654.311-45", "654-987-321-45", LocalDate.of(2001, Month.JUNE, 17), "Carlos", "71987643135");
        Juridica juridica = new Juridica("321.654.987.321-54", "987654", "Carlos", "71654231984");
       
        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
        
    }
}
