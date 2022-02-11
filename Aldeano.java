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
public abstract class Aldeano {

    public String nombre, apellido;
    public int vida, edad;

    public Aldeano(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vida = vida;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Aldeano{" + "nombre=" + nombre + ", apellido=" + apellido + ", vida=" + vida + ", edad=" + edad + '}';
    }

    //Las profesiones compartin misma funcion que es
    public abstract int extra(Aldeano ataque);

}
