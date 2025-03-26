package ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
    Animal elefante;
    Animal crocodilo;
    Animal macaco;

    @BeforeEach
    void setUp() {
        elefante = new Animal("Dumbo",true, Alimento.FRUTAS);
        crocodilo = new Animal("Jambo", true,Alimento.CARNE);
        macaco = new Animal("Gorila",true,Alimento.FRUTAS);
    }

    @Test
    void comeFruta(){
        elefante.comer(Alimento.FRUTAS);
        assertFalse(elefante.isComFome());
        assertTrue(crocodilo.isComFome());
        assertTrue(macaco.isComFome());
    }

    @Test
    void comidaNull(){
        elefante.comer(null);
        assertTrue(elefante.isComFome());
    }
}
