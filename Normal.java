/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;

/**
 *
 * @author jcgof
 */
public class Normal extends Aldeano{
    
    public int dano=50;

    public Normal(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Normal{" + super.toString() + "dano=" + dano + '}';
    }
    @Override
    public int extra(Aldeano ataque){
        if(ataque instanceof Pacifista)
            return (int)Math.round(getDano()* 0.05);
        return getDano();
    }
    
    
    
    
}
