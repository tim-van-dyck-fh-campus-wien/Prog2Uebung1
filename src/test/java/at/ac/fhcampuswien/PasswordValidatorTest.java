package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator pw;
    @BeforeEach
    void setup(){
        this.pw = new PasswordValidator();
    }
    @Test
    @DisplayName("Password to short")
    public void CheckPasswordLength_case1(){
        String pwd = "aS#1";
        assertFalse(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Password to long")
    public void CheckPasswordLength_case2(){
        String pwd = "aS#1aaS#1aaS#1aaS#1aaS#1aff";
        assertFalse(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Password length correct")
    public void CheckPasswordLength_case3(){
        String pwd="as#1as#1f";
        assertTrue(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Passwords letters all capital")
    public void CheckPasswordCapitals_case1(){
        String pwd="AS#1AS#1F";
        assertFalse(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Passwords letters all small")
    public void CheckPasswordCapitals_case2(){
        String pwd="as#1as#1f";
        assertFalse(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Passwords letters are capitals, and small ones")
    public void CheckPasswordCapitals_case3(){
        String pwd="As#1as#1f";
        assertTrue(pw.checkPassword(pwd));
    }
    @Test
    @DisplayName("Passowrd contains no letters")
    public void CheckPasswordCapitals_case4(){
        String pwd="12#112#12";
        assertFalse(pw.checkPassword(pwd));
    }



}
