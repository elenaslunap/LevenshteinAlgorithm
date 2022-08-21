/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package levenshteinalgorithm;

/**
 *
 * @author elenalunapalacio
 */
public class LevenshteinAlgorithm {

        
    public static int edit(String s1, String s2){
        return edit(s1, s2, 0);
    }
    
    private static int edit(String s1, String s2, int cont){
        // caso base: cuando se acaba una de las dos cadenas
        if (s1.length() == 0 || s2.length() == 0){
            // las sobrantes se tendrían que eliminar, se suman operaciones
            return cont + s1.length() + s2.length();
        }
        
        //Existen cuatro opciones: nada, sustituir, insertar y borrar
        if (s1.charAt(0) == s2.charAt(0)){
            return edit(s1.substring(1), s2.substring(1), cont);
        }
        
        // uno por cada rama del árbol
        int sus = edit(s1.substring(1), s2.substring(1), cont + 1); 
        int ins = edit(s1.substring(1), s2, cont + 1); 
        int bor = edit(s1, s2.substring(1), cont + 1);
        
        // Encontrar la distancia más pequeña
        int aux = Math.min(sus, ins);
        return Math.min(aux, bor);
        
    }
    
    public static void main(String[] args) {
        System.out.println(edit("hola", "hola"));
        System.out.println(edit("hola", "holaa"));
        System.out.println(edit("hola", "bola"));
        System.out.println(edit("hola", "ola"));
        System.out.println(edit("estela", "estrella"));
        System.out.println(edit("mapa", "maria"));
    }
    
}
