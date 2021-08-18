package base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ValidateHelperTest {

    @Test
    public void isNotEmptyArray() {
        System.out.println("isNotEmptyArray");
        String[] str = {"1"};
        System.out.println(ValidateHelper.isNotEmptyArray(str));

    }

    @Test
    public void isEmptyString() {
        System.out.println("isEmptyString");
        System.out.println(ValidateHelper.isEmptyString(""));
    }

    @Test
    public void isNotEmptyString() {
        System.out.println("isNotEmptyString");
        System.out.println(ValidateHelper.isNotEmptyString(""));
    }

    @Test
    public void isEmptyCollection() {
        System.out.println("isEmptyCollection");
        System.out.println(ValidateHelper.isEmptyCollection(new ArrayList()));
    }

    @Test
    public void isNotEmptyCollection() {
        System.out.println("isNotEmptyCollection");
        System.out.println(ValidateHelper.isNotEmptyCollection(new ArrayList()));
    }

    @Test
    public void isNotEmptyMap() {
        System.out.println("isNotEmptyMap");
        System.out.println(ValidateHelper.isNotEmptyMap(new HashMap()));
    }

    @Test
    public void isEmptyMap() {
        System.out.println("isEmptyMap");
        System.out.println(ValidateHelper.isEmptyMap(new HashMap()));
    }

    @Test
    public void isEmpty() {
        System.out.println("isEmpty");

        System.out.println(ValidateHelper.isEmpty(""));
    }
}