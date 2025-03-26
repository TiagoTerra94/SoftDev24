package ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator aMinhaCalculadora;

    @BeforeEach
    public void setUp() {
        aMinhaCalculadora = new Calculator("Maquina"); //cada vez que invoco um metodo crio uma nova calculadora
    }

    @Test
    public void addPositiveTest(){
        assertEquals(15,aMinhaCalculadora.add(10,5));
        assertEquals(-40,aMinhaCalculadora.add(-50,10));
    }

    @Test
    public void testDivide() {
        int result = aMinhaCalculadora.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            aMinhaCalculadora.divide(10, 0);
        });
    }
}
