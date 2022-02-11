/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;
import java.util.ArrayList; 
/**
 *
 * @author jcgof
 */
public class Familia {
    //Linaje es un ArrayList adentro de la clase Familia
    //Aldeano es su propia clase
    
    public ArrayList apellidoU = new ArrayList();

    public Familia() {
    }

    public ArrayList getApellidoU() {
        return apellidoU;
    }

    public void setApellidoU(ArrayList apellidoU) {
        this.apellidoU = apellidoU;
    }

    @Override
    public String toString() {
        return "Familia{" + "apellidoU=" + apellidoU + '}';
    }
    
    
    
    
}
