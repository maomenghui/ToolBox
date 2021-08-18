package base;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexUtilsTest {

    @Test
    public void find() {
        System.out.println("find ");
        String regex = "1[38]\\d{11}";//定义手机号规则 13,18开头
        System.out.println(RegexUtils.find("138123345341", "1[38]\\d{9}"));

    }

    @Test
    public void isEmail() {
        System.out.println("isEmail ");
        System.out.println(RegexUtils.isEmail("123@qq.com"));

    }

    @Test
    public void isChinese() {
        System.out.println("isChinese ");
        System.out.println(RegexUtils.isChinese("123"));

    }

    @Test
    public void isDouble() {
        System.out.println("isDouble ");
        System.out.println(RegexUtils.isDouble("123"));

    }

    @Test
    public void isInteger() {
        System.out.println("isInteger ");
        System.out.println(RegexUtils.isInteger("123"));

    }
}