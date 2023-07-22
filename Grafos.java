
/*
    practica de grafos construir matriz de adyacencia 
    2.construir métodos verificar arista
    3.construir métodos borrar arista
    4.contruir método obtener vecinos
        4.1 construir las validaciones a los métodos
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
    
    public boolean ExisteArista(int i, int j){ 
        
        verificarGrafo(i);
        verificarGrafo(j);
        VerificarCiclos(i, j);
        
        return A[i][j]; 
    } 
    
    public void BorrarArista(int i, int j) { 
        
        A[i][j] = false;
        A[j][i] = false; 
    }
    
    public int[] ObtenerVecinos(int i){
        
        int vecinos [] = new int [A.length];
           
        for (int j = 0; j < A.length; j++) {
        
            if (A[i][j] == true) { 
        
                vecinos[j] = j;
            }            
        } 
        return vecinos;
    }
    
    public void verificarGrafo(int i) throws IllegalArgumentException {
        if(i > A.length)
            
            throw new IllegalArgumentException("la posicion no puede ser mayor que el tam de grafo");
        
        if(i < 0)
            
            throw new IllegalArgumentException("la posicion no puede negativa");
    }
    
    public void VerificarCiclos(int i, int j) throws IllegalArgumentException {
        if(i==j)
            
            throw new IllegalArgumentException("No pueden existir ciclos en el grafo");
    }

}
