package Controllers;

import org.junit.jupiter.api.BeforeEach;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {

    private AdminController adminController;
    private AdminController adminControllerControlo;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        adminController = new AdminController();
        adminControllerControlo = new AdminController();
    }
}