/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ud4PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] jugadas = {"piedra","papel","tijera"}; // creamos un array unidimensional de cadenas de caracteres
        int ordenador; // variable que nos sirve para guardar la jugada del ordenador, además nos servirá para acceder a la posición del array anterior
        String usuario = new String();
        Random aleatorio = new Random();
        System.out.print("Escribe la jugada del usuario (\"piedra\", \"papel\" o \"tijera\"):");
            usuario = teclado.next();
        ordenador=aleatorio.nextInt(3); // generaremos un número entre 0, 1 y 2
            System.out.println("La jugada del ordenador es "+jugadas[ordenador]);

        if(usuario.equalsIgnoreCase(jugadas[ordenador])){ // habrá empate si lo que el usuario ha escrito coincide con la palabra que ocupa la posición del número generado por el ordenador
            System.out.println("Empate");
        }
        else if(jugadas[ordenador].equals("piedra") && usuario.equalsIgnoreCase("papel")){
            System.out.println("Has ganado");
        }
        else if(jugadas[ordenador].equals("papel") && usuario.equalsIgnoreCase("tijera")){
            System.out.println("Has ganado");
        }
        else if(jugadas[ordenador].equals("tijera") && usuario.equalsIgnoreCase("piedra")){
            System.out.println("Has ganado");
        }
        else{
            System.out.println("Has perdido");
        }
    }    
}