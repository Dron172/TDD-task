package tests;

import main.PhoneBook;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @Test
    public void testAdd() {
        //assert
        int expected = 2;
        int result;

        //act

        phoneBook.add("Ivan", "89123456789");
        result = phoneBook.add("Masha", "8987654321");

        //assert
        assertEquals(expected, result);
    }


}