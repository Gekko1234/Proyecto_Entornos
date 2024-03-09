package com.mycompany.piedrapapelytijera;

import java.util.Random;
import java.util.Scanner;

/**
 * La clase PiedraPapelyTijera contiene métodos para jugar al juego Piedra, Papel o Tijera.
 */
public class PiedraPapelyTijera {

    private String[] jugadas = {"piedra", "papel", "tijera"};
    private Random aleatorio;
    private Scanner teclado;

    /**
     * Constructor de la clase PiedraPapelyTijera.
     * Inicializa las variables aleatorio y teclado.
     */
    public PiedraPapelyTijera(){
        aleatorio = new Random();
        teclado = new Scanner(System.in);
    }

    /**
     * Método para jugar una ronda del juego.
     * Genera una jugada aleatoria para la computadora, solicita una jugada al usuario
     * y determina el ganador.
     * @param usuario La jugada del usuario (piedra, papel o tijera).
     */
    public void jugar() {
        int ordenador = aleatorio.nextInt(3);
        System.out.print("Escribe la jugada del usuario (\"piedra\", \"papel\" o \"tijera\"): ");
        String usuario = teclado.next();
        System.out.println("La jugada del ordenador es " + jugadas[ordenador]);
        determinarGanador(usuario, ordenador);
    }

    /**
     * Determina el ganador de la ronda.
     * Compara la jugada del usuario con la jugada del ordenador y muestra el resultado.
     * @param usuario La jugada del usuario.
     * @param ordenador La jugada generada aleatoriamente por la computadora.
     */
    private void determinarGanador(String usuario, int ordenador) {
        if (usuario.equalsIgnoreCase(jugadas[ordenador])) {
            System.out.println("Empate");
        } else if (jugadas[ordenador].equals("piedra") && usuario.equalsIgnoreCase("papel")
                || jugadas[ordenador].equals("papel") && usuario.equalsIgnoreCase("tijera")
                || jugadas[ordenador].equals("tijera") && usuario.equalsIgnoreCase("piedra")) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }
    }
    
    /**
     * Método principal.
     * Crea una instancia de PiedraPapelyTijera y llama al método jugar() para comenzar el juego.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        PiedraPapelyTijera juego = new PiedraPapelyTijera();
        juego.jugar();
    }
}