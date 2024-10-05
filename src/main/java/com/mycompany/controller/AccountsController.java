/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.AltaCuenta;
import com.mycompany.ui.PantallaCuentas;

/**
 *
 * @author nicle
 */
public class AccountsController {
    // Instancia única (Singleton)
    private static final AccountsController instance = new AccountsController();
    
    private final PantallaCuentas pantallaCuentas;
    private final AltaCuenta nuevaCuenta;
    
    private AccountsController(){
        this.nuevaCuenta = new AltaCuenta();
        this.pantallaCuentas = new PantallaCuentas();
    }
    
    // Método público estático para obtener la instancia única de AccountsController
    public static AccountsController getInstance() {
        return instance;
    }
    
    public void pantallaCuentasVisible(){
        this.pantallaCuentas.setVisible(true);
        this.pantallaCuentas.setLocationRelativeTo(null);
    }
    
    public void pantallaCuentasCerrar(){
        this.pantallaCuentas.dispose();
    }
    
    public void altaCuentaVisible(){
        this.nuevaCuenta.setVisible(true);
        this.nuevaCuenta.setLocationRelativeTo(null);
    }
    
    public void altaCuentaCerrar(){
        this.nuevaCuenta.dispose();
    }
}
