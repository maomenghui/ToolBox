package base;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MoneyUtilsTest {


    @Test
    public void number2CNMontray() {
        System.out.println(MoneyUtils.number2CNMontray("123456"));
    }

    @Test
    public void testNumber2CNMontray() {
        System.out.println(MoneyUtils.number2CNMontray(new BigDecimal(123456)));
    }

    @Test
    public void accountantMoney() {
        // 123.46
        System.out.println(MoneyUtils.accountantMoney(new BigDecimal(123.4567)));

        // 12,345.00
        System.out.println(MoneyUtils.accountantMoney(new BigDecimal(12345)));
    }

    @Test
    public void getFormatMoney() {
        // 23402.3百元
        System.out.println(MoneyUtils.getFormatMoney(new BigDecimal(2340232.2342), 1, 3));
    }

    @Test
    public void getAccountantMoney() {
        // 123,456.00元
        System.out.println(MoneyUtils.getAccountantMoney(new BigDecimal(123456), 2, 1));
    }
}