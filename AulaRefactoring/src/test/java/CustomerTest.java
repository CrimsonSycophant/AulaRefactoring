/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bernardo Cipriano
 */
public class CustomerTest {
    
    

    public void testStatement() {
       
        Customer user = new Customer("Usuário");
        
        Movie filme = new Movie("Bee Movie", 2);
        Movie filme2 = new Movie("Jumanji", 1);
        
        user.addRental(new Rental(filme, 3));
        user.addRental(new Rental(filme2, 2));
        
        String saida = "Rental record for Usuário\n";
        saida += "\tBee Movie\t1.5\n";
        saida += "\tJumanji\t6\n";
        saida += "Amount owed is 7.5\n";
        saida += "You earned 3 frequent renter points";
        
        assertEquals(saida, user.statement());
        
    }
    
}
