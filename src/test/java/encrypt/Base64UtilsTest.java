package encrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class Base64UtilsTest {

    @Test
    public void encrypt() throws Exception {
        byte[] decrypt = Base64Utils.decrypt("admin123");
        System.out.println(Base64Utils.encrypt(decrypt));
    }

    @Test
    public void decrypt() throws Exception {
        System.out.println(Base64Utils.decrypt("admin123").toString());
    }
}