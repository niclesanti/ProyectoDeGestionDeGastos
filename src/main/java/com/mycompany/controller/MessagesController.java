/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.MensajeConfirmacion;
import com.mycompany.ui.MensajeError;
import com.mycompany.ui.MensajeExito;

/**
 *
 * @author nicle
 */
public class MessagesController {
    // Instancia única (Singleton)
    private static final MessagesController instance = new MessagesController();
    
    private final MensajeConfirmacion confirmacion;
    private final MensajeError error;
    private final MensajeExito exito;
    
    private MessagesController(){
        this.confirmacion = new MensajeConfirmacion();
        this.error = new MensajeError();
        this.exito = new MensajeExito();
    }
    
    // Método público estático para obtener la instancia única de MessagesController
    public static MessagesController getInstance() {
        return instance;
    }
    
    public void mensajeConfirmacionVisible(){
        this.confirmacion.setVisible(true);
        this.confirmacion.setLocationRelativeTo(null);
    }
    
    public void mensajeConfirmacionCerrar(){
        this.confirmacion.dispose();
    }
    
    public void mensajeErrorVisible(){
        this.error.setVisible(true);
        this.error.setLocationRelativeTo(null);
    }
    
    public void mensajeErrorCerrar(){
        this.error.dispose();
    }
    
    public void mensajeExitoVisible(){
        this.exito.setVisible(true);
        this.exito.setLocationRelativeTo(null);
    }
    
    public void mensajeExitoCerrar(){
        this.exito.dispose();
    }
}
