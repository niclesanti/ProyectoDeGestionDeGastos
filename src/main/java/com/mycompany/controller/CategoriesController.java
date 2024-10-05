/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.ui.AltaCategoria;
import com.mycompany.ui.PantallaCategorias;
import com.mycompany.ui.VerCategoria;

/**
 *
 * @author nicle
 */
public class CategoriesController {
    // Instancia única (Singleton)
    private static final CategoriesController instance = new CategoriesController();
    
    private final PantallaCategorias pantallaCategorias;
    private final AltaCategoria nuevaCategoria;
    private final VerCategoria verCategoria;
    
    private CategoriesController(){
        this.pantallaCategorias = new PantallaCategorias();
        this.nuevaCategoria = new AltaCategoria();
        this.verCategoria = new VerCategoria();
    }
    
    // Método público estático para obtener la instancia única de CategoriesController
    public static CategoriesController getInstance() {
        return instance;
    }
    
    public void pantallaCategoriasVisible(){
        this.pantallaCategorias.setVisible(true);
        this.pantallaCategorias.setLocationRelativeTo(null);
    }
    
    public void pantallaCategoriasCerrar(){
        this.pantallaCategorias.dispose();
    }
    
    public void altaCategoriaVisible(){
        this.nuevaCategoria.setVisible(true);
        this.nuevaCategoria.setLocationRelativeTo(null);
    }
    
    public void altaCategoriasCerrar(){
        this.nuevaCategoria.dispose();
    }
    
    public void verCategoriaVisible(){
        this.verCategoria.setVisible(true);
        this.verCategoria.setLocationRelativeTo(null);
    }
    
    public void verCategoriaCerrar(){
        this.verCategoria.dispose();
    }
}
