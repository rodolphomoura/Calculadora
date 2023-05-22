/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author user
 */
public class Calculadora {
    
    public int soma (int a, int b){
        return a+b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(3, 5);
        System.out.println("Resultado:"+ resultado);
        // TODO code application logic here
    }
    
}
