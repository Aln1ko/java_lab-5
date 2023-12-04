import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ex17Test {

    @Test
    public void testContactInfo() {
        ex17 contact = new ex17();
        assertEquals("name1", contact.getName());
        assertEquals("phone1", contact.getPhone());
        assertEquals("email1", contact.getEmail());
        assertEquals("telegramUsername1", contact.getTelegramUsername());
    }

    @Test
    public void testSetContact() {
        ex17 contact = new ex17();
        contact.setContact("John Doe", "123456789", "john@example.com", "@johndoe");
        assertEquals("John Doe", contact.getName());
        assertEquals("123456789", contact.getPhone());
        assertEquals("john@example.com", contact.getEmail());
        assertEquals("@johndoe", contact.getTelegramUsername());
    }

    @Test
    public void testDisplayContactInfo() {
        ex17 contact = new ex17();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        contact.displayContactInfo();

        String expectedOutput = "Name: name1" + System.lineSeparator() +
                "Phone: phone1" + System.lineSeparator() +
                "Email: email1" + System.lineSeparator() +
                "Telegram Username: telegramUsername1" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
