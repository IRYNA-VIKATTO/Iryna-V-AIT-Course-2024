package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    User user;

    final String email = "peter@mail.de";//
    final String password = "123456Az!";//

    @BeforeEach
    void setUp() {
        user = new User(email, password);// create new "fresh" odject user

    }

    @Test
    void testValidEmail(){

        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void testValidPassword() {

        assertEquals("123456Az!",user.getPassword());
        System.out.println(user.getPassword());
    }

    @Test
    void setEmail(){
        String email = "peter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
        System.out.println(user.getEmail());

    }

    @Test
    void setEmailWithTwoDots() {
        String email = "peter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
        System.out.println(user.getEmail());
    }


    @Test
    void testValidEmail_NotDomain() {
        String email ="peter@.";//Проверка email без домена
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());

    }

    @Test
    void testValidEmail_EmptyString() {
        String email ="";//Проверка на пустую строку
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void testValidEmail_InvalidCharacters() {
        String email ="peter!@mail.de";//Проверка на недопустимые символы
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void testInvalidEmail_NoTld() {
        String email = "peter@mail";//Проверка на отсутствие TLD (например, .com, .ukr)
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void setValidPasswordLength() {
        user.setPassword("1234A!");// 7 symbol
        user.setPassword("123456123456123456Az!");
        assertEquals("123456Az!",user.getPassword());


    }

    @Test
    void setValidPasswordMinOneDigit() {
        user.setPassword("Asdfghj!");
        assertEquals("123456Az!",user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterUpperCase() {
        user.setPassword("123456az!");
        assertEquals("123456Az!",user.getPassword());

    }

    @Test
    void setValidPasswordOneLetterLowerCase() {
        user.setPassword("123456AZ!");
        assertEquals("123456Az!",user.getPassword());

    }

    @Test
    void setValidPasswordOneSpecialSymbol() {
        user.setPassword("123456Az");
        assertEquals("123456Az!",user.getPassword());

    }
}