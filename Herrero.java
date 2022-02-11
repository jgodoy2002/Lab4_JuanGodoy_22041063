/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;
import java.util.Random;
/**
 *
 * @author jcgof
 */
public class Herrero extends Aldeano{
    
    Random random = new Random();
    public int dano = random.nextInt(500-200+1)+200;
    public Herrero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        if(dano>200 && dano<500){
            this.dano=dano;
        } else{
            System.out.println("Daño ingresado no esta entre 200 y 500!!");
        }
    }

    @Override
    public String toString() {
        return "Herrero{" + super.toString() +  "dano=" + dano + '}';
    }
    
    public int extra(Aldeano ataque){
        if(ataque instanceof Agronomo){
            return (int)Math.round(getDano()*0.10);
        } else if (ataque instanceof Pacifista) {
            return (int)Math.round(getDano()*0.05);
        } return getDano();
    }
    
    
}
