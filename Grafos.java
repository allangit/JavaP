
/*
    practica de grafos construir matriz de adyacencia 
    2.construir métodos verificar arista
    3.construir métodos borrar arista
    4.contruir método obtener vecinos
    5.validación de los metodos unitTest

*/
package com.mycompany.principal;

public class Grafos {
    
    private boolean A[][];
    
    public Grafos(int vertices){
        
        A=new boolean [vertices][vertices];
        
    }
    
    public void AgregarArista(int i, int j) {
        A[i][j] = true;
        A[j][i] = true;
    }
}
