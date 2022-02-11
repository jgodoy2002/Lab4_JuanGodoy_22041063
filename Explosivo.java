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
public class Explosivo extends Aldeano {

    public int dano = 250;

    public Explosivo(String nombre, String apellido, int edad, int vida) {
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
        return "Explosivo{" + super.toString() + "dano=" + dano + '}';
    }

    public int extra(Aldeano ataque) {
        if (ataque instanceof Herrero) {
            return (int)Math.round(getDano()*0.05);
        } else if (ataque instanceof Agronomo)
        {
            return (int)Math.round(getDano()*0.10);
        } 
        return getDano();
    }

}
