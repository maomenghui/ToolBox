package base;

import date.DateFormatUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ConvertUtilsTest {

    @Test
    public void strToInt() {
        // 123
        System.out.println(ConvertUtils.strToInt("123", 1));
    }

    @Test
    public void strToLong() {
        System.out.println(ConvertUtils.strToLong("123", 1));
    }

    @Test
    public void strToFloat() {
        System.out.println(ConvertUtils.strToFloat("123", 1));
    }

    @Test
    public void strToDouble() {
        System.out.println(ConvertUtils.strToDouble("123", 1));
    }

    @Test
    public void strToDate() {
        System.out.println(ConvertUtils.strToDate("20201212", new Date()));
    }

    @Test
    public void testStrToDate() {
        System.out.println(ConvertUtils.strToDate("20201212", DateFormatUtils.DATE_FORMAT2, new Date()));
    }

    @Test
    public void dateToStr() {
        System.out.println(ConvertUtils.dateToStr(new Date(), ""));
    }

    @Test
    public void testDateToStr() {
        System.out.println(ConvertUtils.dateToStr(new Date(),DateFormatUtils.DATE_FORMAT2, ""));
    }

    @Test
    public void strToStr() {
        System.out.println(ConvertUtils.strToStr("123", ""));
    }

    @Test
    public void dateToSqlDate() {
        System.out.println(ConvertUtils.dateToSqlDate(new Date()));

    }

    @Test
    public void dateToSqlTimestamp() {
        System.out.println(ConvertUtils.dateToSqlTimestamp(new Date()));
    }

}