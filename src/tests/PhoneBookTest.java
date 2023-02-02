package tests;

import main.PhoneBook;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook = PhoneBook.getINSTANCE();

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

    @Test
    public void testFindByNumber() {
        //assert
        String expected = "Ivan";
        String result;
        phoneBook.add("Ivan", "89123456789");
        phoneBook.add("Dasha", "8987654321");
        phoneBook.add("Irina", "8000111222");

        //act
        result = phoneBook.findByNumber( "89123456789");

        //assert
        assertEquals(expected, result);
    }

}