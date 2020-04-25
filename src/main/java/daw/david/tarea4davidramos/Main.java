/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.david.tarea4davidramos;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pelota pelota = new Pelota();
        Pelota pelotaConParametros = new Pelota(300, "cuero", "volley-playa");
        
        System.out.println("Pelota por defecto: " + pelota);
        System.out.println("Pelota con parámetros: " + pelotaConParametros);
    }
    
}
