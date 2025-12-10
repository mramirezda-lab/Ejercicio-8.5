/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ej91;

public class Contacto {
    String nombres;
    String apellidos;
    String fechaNacimiento;  // ← Cambiado a String
    String dirección;
    String teléfono;
    String correo;
    
    Contacto(String nombres, String apellidos, String fechaNacimiento, 
             String dirección, String teléfono, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.correo = correo;
    }
}