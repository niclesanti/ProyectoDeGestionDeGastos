/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectodegestiondegastos;

import com.mycompany.controller.LoginController;
import javax.swing.SwingUtilities;



/**
 *
 * @author nicle
 */
public class ProyectoDeGestionDeGastos {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear y mostrar la pantalla de login
                LoginController loginController = LoginController.getInstance();
                loginController.loginVisible();
            }
        });
        
    }
}
