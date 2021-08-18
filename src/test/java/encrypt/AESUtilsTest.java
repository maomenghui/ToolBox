package encrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class AESUtilsTest {

    @Test
    public void decrypt() throws Exception {
        // 1QhiZxLA9NZZ753X4kChMA==
        System.out.println(AESUtils.encrypt("admin123", AESUtils.KEY));
    }

    @Test
    public void encrypt() throws Exception {
        // admin123
        System.out.println(AESUtils.decrypt("1QhiZxLA9NZZ753X4kChMA==", AESUtils.KEY));
    }
}