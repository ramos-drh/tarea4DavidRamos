/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.david.tarea4davidramos;

/**
 *
 * @author ramos
 */
public class Pelota {
    private double peso;
    private String material;
    private String deporte;

    public Pelota(double peso, String material, String deporte) {
        this.peso = peso;
        this.material = material;
        this.deporte = deporte;
    }
    
    public Pelota(){
        peso = 200;
        material = "tela";
        deporte = "baloncesto";
    }
    
}
