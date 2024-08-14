/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectodegestiondegastos;

import com.mycompany.ui.*;


/**
 *
 * @author nicle
 */
public class ProyectoDeGestionDeGastos {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
        PantallaPrincipal principal = new PantallaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
        
        
        
    }
}
