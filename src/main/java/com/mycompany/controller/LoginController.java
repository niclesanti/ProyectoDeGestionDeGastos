/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.Login;
import com.mycompany.ui.RegistroUsuario;

/**
 *
 * @author nicle
 */
public class LoginController {
    // Instancia única (Singleton)
    private static LoginController instance = new LoginController();;
    
    private final Login login;
    private final RegistroUsuario registro;
    
    //luego debemos crear un atributo para guardar el usuario autenticado
    //private Usuario usuarioAutenticado
    
    private LoginController(){
        this.login = new Login();
        this.registro = new RegistroUsuario();
    }
    
    // Método público estático para obtener la instancia única de LoginController
    public static LoginController getInstance() {
        /*if(LoginController.instance == null){
            LoginController.instance = new LoginController();
        }
        return LoginController.instance;*/
        return instance;
        
    }
    
    public void loginVisible(){
        this.login.setVisible(true);
        this.login.setLocationRelativeTo(null);
    }
    
    public void loginCerrar(){
        this.login.dispose();
    }
    
    public void registrarUsuarioVisible(){
        this.registro.setVisible(true);
        this.registro.setLocationRelativeTo(null);
    }
    
    public void registrarUusarioCerrar(){
        this.registro.dispose();
    }
}
