package encrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilsTest {

    @Test
    public void encrypt() {
        // BE8AC916FF57F6EC5BC54503F02935CA2104BDF8
        System.out.println(MD5Utils.encrypt("admin123", MD5Utils.SHA_KEY));
    }

}