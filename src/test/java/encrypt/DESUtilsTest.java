package encrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class DESUtilsTest {

    @Test
    public void encrypt() {
        System.out.println(DESUtils.encrypt("admin123", DESUtils.KEY));
    }

    @Test
    public void decrypt() {
        System.out.println(DESUtils.decrypt("ovD+5L7WkRwZLJTCcl2pvA==", DESUtils.KEY));
    }
}