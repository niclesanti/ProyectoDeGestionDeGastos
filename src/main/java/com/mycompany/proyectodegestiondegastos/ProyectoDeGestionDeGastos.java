/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectodegestiondegastos;

import com.mycompany.controller.LoginController;
import com.mycompany.controller.PresentationController;
import java.util.concurrent.Semaphore;



/**
 *
 * @author nicle
 */
public class ProyectoDeGestionDeGastos {
    public static Semaphore empezarPrograma = new Semaphore(0);
    
    public static void main(String[] args) {
        
        
        
        new Thread(new PresentationController()).start();
        
        empezarPrograma.acquireUninterruptibly();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crear y mostrar la pantalla de login
                LoginController loginController = LoginController.getInstance();
                
                
                loginController.loginVisible();
                
            }
        });
        
    }
}
