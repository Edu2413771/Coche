/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.cesba;

/**
 *
 * @author Danyf
 */
public class Coche {
    
     private int  Modelo;
    private String matricula, marca;
    private Boolean electrico;
    
    public int getModelo(){
    return Modelo;
    }
    
    public void setModelo(int modelo){
    
        if(modelo >=1970 && modelo <2024){
            this.Modelo = modelo;
            System.out.println("\nDentro del rango de modelo");
        }
        else{
        
            System.out.println("\nFuera de rango de modelo");
        }
    
    }
    
    public String getMatricula(){
        return matricula;
    }
        public void setMatricula(String matricula){
            this.matricula=matricula;
            }
    
        
    public String getMarca(){
        return marca;
    }
        public void setMarca(String marca){
            this.marca=marca;
            }
        
    public Boolean isElectrico(){
        return electrico;
    }
        public void setElectrico(boolean electrico){
            this.electrico=electrico;
            }
        
    public void imprimirCoche(){
        
        System.out.println("Matricula: "+matricula);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Es Electrico?: "+(electrico ? "Si" : "No"));
        
    
    }
    
}
