import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    public void newPhoneBook() {
        phoneBook = new PhoneBook();
    }

    @AfterEach
    public void closePhoneBook() {
        phoneBook = null;
    }

    @Test
    public void testAdd () {
        Assertions.assertEquals(phoneBook.add("Вася", "89996789123"), 1);
    }
    @Test
    public void testAdd2 () {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.add("Ваня", "91768954444"),2);
    }
    @Test
    public void testAddSame () {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.add("Вася", "89996789123"),1);
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.findByNumber("89996789123"), "Вася");
    }

    @Test
    public void testFindByNumber2() {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.findByNumber("89123"), null);

    }

    @Test
    public void testFindByName() {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.findByName(), "89996789123");
    }
    @Test
    public void testFindByName2() {
        phoneBook.add("Вася", "89996789123");
        Assertions.assertEquals(phoneBook.findByName(), null);
    }




}
