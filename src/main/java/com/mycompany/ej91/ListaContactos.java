/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej91;

import java.util.Vector;

public class ListaContactos {
    Vector lista;
    ListaContactos() {
    lista = new Vector(); 
    }
    void agregarContacto(Contacto contacto) {
    lista.add(contacto);
    }
}