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
public class Pacifista extends Aldeano{
    public int dano = 0;

    public Pacifista(String nombre, String apellido, int edad, int vida) {
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
        return "Pacifista{" + super.toString() + "dano=" + dano + '}';
    }
    @Override
    public int extra(Aldeano ataque){
        return 0;
    }
    
}
