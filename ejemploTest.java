
import com.mycompany.piedrapapelytijera.PiedraPapelyTijera;
import org.junit.jupiter.api.Assertions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


/**
 *
 * @author usuario
 */
public class PiedraPapelyTijeraTest {
    
    public void TestJuego() {
        PiedraPapelyTijera juego = new PiedraPapelyTijera();
        juego.jugar();
        
        Assertions.assertEquals("piedra","piedra");
        juego.jugar();
        Assertions.assertEquals("piedra","papel");
        juego.jugar();
        Assertions.assertEquals("piedra","tijera");
        juego.jugar();
        
    }
}
