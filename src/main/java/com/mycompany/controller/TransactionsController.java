/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.AltaDescripcion;
import com.mycompany.ui.AltaTransacciones;
import com.mycompany.ui.BuscarTransacciones;
import com.mycompany.ui.PantallaTransacciones;
import com.mycompany.ui.SeleccionTransaccion;

/**
 *
 * @author nicle
 */
public class TransactionsController {
    // Instancia única (Singleton)
    private static final TransactionsController instance = new TransactionsController();
    
    private final PantallaTransacciones pantallaTransacciones;
    private final AltaTransacciones nuevaTransaccion;
    private final BuscarTransacciones buscarTransacciones;
    private final SeleccionTransaccion seleccionTransaccion;
    private final AltaDescripcion nuevaDescripcion;
    
    private TransactionsController(){
        this.pantallaTransacciones = new PantallaTransacciones();
        this.nuevaTransaccion = new AltaTransacciones();
        this.buscarTransacciones = new BuscarTransacciones();
        this.seleccionTransaccion = new SeleccionTransaccion();
        this.nuevaDescripcion = new AltaDescripcion();
    }
    
    // Método público estático para obtener la instancia única de TransactionsController
    public static TransactionsController getInstance() {

        return instance;
        
    }
    
    public void pantallaTransaccionesVisible(){
        this.pantallaTransacciones.setVisible(true);
        this.pantallaTransacciones.setLocationRelativeTo(null);
    }
    
    public void pantallaTransaccionesCerrar(){
        this.pantallaTransacciones.dispose();
    }
    
    public void altaTransaccionesVisible(){
        this.nuevaTransaccion.setVisible(true);
        this.nuevaTransaccion.setLocationRelativeTo(null);
    }
    
    public void altaTransaccionesCerrar(){
        this.nuevaTransaccion.dispose();
    }
    
    public void buscarTransaccionesVisible(){
        this.buscarTransacciones.setVisible(true);
        this.buscarTransacciones.setLocationRelativeTo(null);
    }
    
    public void buscarTransaccionesCerrar(){
        this.buscarTransacciones.dispose();
    }
    
    public void seleccionTransaccionVisible(){
        this.seleccionTransaccion.setVisible(true);
        this.seleccionTransaccion.setLocationRelativeTo(null);
    }
    
    public void seleccionTransaccionCerrar(){
        this.seleccionTransaccion.dispose();
    }
    
    public void altaDescripcionVisible(){
        this.nuevaDescripcion.setVisible(true);
        this.nuevaDescripcion.setLocationRelativeTo(null);
    }
    
    public void altaDescripcionCerrar(){
        this.nuevaDescripcion.dispose();
    }
}
