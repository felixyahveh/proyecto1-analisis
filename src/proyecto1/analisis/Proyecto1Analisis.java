/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.analisis;

/**
 *
 * @author Admin
 */
public class Proyecto1Analisis {

    public static void main(String[] args) {
        float ejemplo [][] = {{3,2,1,1},{5,3,4,2},{1,1,-1,1}};
        float ejemplo2 [][] = {{1,2,-1,3,-8},{2,0,2,-1,13},{-1,1,1,-1,8},{3,3,-1,2,-1}};
        
        
        //Ejemplo 1
        System.out.println("Ejercicio 1");
        SistemaEcuaciones se = new SistemaEcuaciones(ejemplo,3);
        se.imprimirMatriz();
        System.out.println("");
        se.gaussJordan();
        se.imprimirMatriz();
        
        System.out.println("Ejercicio 2");
        SistemaEcuaciones se2 = new SistemaEcuaciones(ejemplo2,4);
        se2.imprimirMatriz();
        System.out.println("");
        se2.gaussJordan();
        se2.imprimirMatriz();
    }
    
}
