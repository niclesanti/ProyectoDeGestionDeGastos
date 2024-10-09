/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.proyectodegestiondegastos.ProyectoDeGestionDeGastos;
import com.mycompany.ui.PantallaPresentacion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicle
 */
public class PresentationController implements Runnable{  

    @Override
    public void run() {
        PantallaPresentacion presentacion = new PantallaPresentacion();
        
        presentacion.setVisible(true);
        presentacion.setLocationRelativeTo(null);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PresentationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProyectoDeGestionDeGastos.empezarPrograma.release();
        presentacion.dispose();
    }
    
}
