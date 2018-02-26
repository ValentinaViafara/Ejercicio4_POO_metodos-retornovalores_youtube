/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Operaciones_basicas {
    //Atributos
    
    //Métodos
    
    public int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
    
    public int restar(int num1, int num2){
        int resta=num1-num2;
        return resta;
    }
    
    public int multiplicar(int num1, int num2){
       return num1*num2;
    }
    
    public int division(int num1, int num2){
    return num1/num2;
    }
    
    public void mostrarResultado(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma de los numeros es= "+ suma);
        System.out.println("La resta de los numeros es= "+ resta);
        System.out.println("La multiplicacion de los numero es= "+ multiplicacion);
        System.out.println("La division de los numeros es= "+division);
        
    }
    
}
