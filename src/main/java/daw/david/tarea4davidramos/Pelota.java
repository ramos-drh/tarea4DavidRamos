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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    
    
}
