/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author danie
 */import javax.swing.JOptionPane;

public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite número 1 "));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite número 2 "));
        
        Operaciones_basicas op1= new Operaciones_basicas();
        int suma= op1.sumar(numero1, numero2);
        int resta=op1.restar(numero1, numero2);
        int multiplicacion=op1.multiplicar(numero1, numero2);
        int division=op1.division(numero1,numero2);
        
        op1.mostrarResultado(suma, resta, multiplicacion, division);
        
        
       
        
        
        
        
        
    }
    
}
