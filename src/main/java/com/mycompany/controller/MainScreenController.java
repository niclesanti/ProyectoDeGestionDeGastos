/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.PantallaPrincipal;

/**
 *
 * @author nicle
 */
public class MainScreenController {
    // Instancia única (Singleton)
    private static final MainScreenController instance = new MainScreenController();
    
    private final PantallaPrincipal pantallaPrincipal;
    
    private MainScreenController(){
        this.pantallaPrincipal = new PantallaPrincipal();
    }
    
    // Método público estático para obtener la instancia única de MainScreenController
    public static MainScreenController getInstance() {

        return instance;
        
    }
    
    public void pantallaPrincipalVisible(){
        this.pantallaPrincipal.setVisible(true);
        this.pantallaPrincipal.setLocationRelativeTo(null);
    }
    
    public void pantallaPincipalCerrar(){
        this.pantallaPrincipal.dispose();
    }
}
