/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.cesba;

/**
 *
 * @author Danyf
 */
public class CocheMain {
    
    //Este es un comentario de prueba
    
    public static void main(String[] args){
    
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        coche1.setMatricula("UWU-345-25");
        coche1.setModelo(2004);
        coche1.setMarca("Subaru WXC STI");
        coche1.setElectrico(false);
        coche1.imprimirCoche();
        
        coche2.setMatricula("UED-114-01");
        coche2.setModelo(2018);
        coche2.setMarca("Honda Civic type R");
        coche2.setElectrico(false);
        coche2.imprimirCoche();
        
        coche3.setMatricula("UPV-567-89");
        coche3.setModelo(2023);
        coche3.setMarca("BMW M5");
        coche3.setElectrico(false);
        coche3.imprimirCoche();
        
        
        
}
}