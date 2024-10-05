/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.AltaSube;
import com.mycompany.ui.BuscarSube;
import com.mycompany.ui.PantallaSube;

/**
 *
 * @author nicle
 */
public class SubeController {
    // Instancia única (Singleton)
    private static final SubeController instance = new SubeController();
    
    private final PantallaSube pantallaSube;
    private final AltaSube nuevaSube;
    private final BuscarSube buscarSube;
    
    private SubeController(){
        this.buscarSube = new BuscarSube();
        this.nuevaSube = new AltaSube();
        this.pantallaSube = new PantallaSube();
    }
    
    // Método público estático para obtener la instancia única de SubeController
    public static SubeController getInstance() {
        return instance;
    }
    
    public void pantallaSubeVisible(){
        this.pantallaSube.setVisible(true);
        this.pantallaSube.setLocationRelativeTo(null);
    }
    
    public void pantallaSubeCerrar(){
        this.pantallaSube.dispose();
    }
    
    public void altaSubeVisible(){
        this.nuevaSube.setVisible(true);
        this.nuevaSube.setLocationRelativeTo(null);
    }
    
    public void altaSubeCerrar(){
        this.nuevaSube.dispose();
    }
    
    public void buscarSubeVisible(){
        this.buscarSube.setVisible(true);
        this.buscarSube.setLocationRelativeTo(null);
    }
    
    public void buscarSubeCerrar(){
        this.buscarSube.dispose();
    }
}
