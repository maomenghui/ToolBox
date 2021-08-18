package base;

import org.junit.Test;

public class IdCardValidatorTest {

    @Test
    public void isValidatedAllIdCard() {
        System.out.println(IdCardValidator.isValidate18IdCard("123"));
    }

    @Test
    public void isValidate18IdCard() {
        System.out.println(IdCardValidator.isValidate18IdCard(""));
    }

    @Test
    public void is18IdCard() {
        System.out.println(IdCardValidator.is18idCard("123"));
    }

    @Test
    public void getUserSex() {
        IdCardValidator.getUserSex("123");
    }
}