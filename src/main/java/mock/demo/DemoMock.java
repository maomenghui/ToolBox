package mock.demo;

import mock.demo.service.BaseService;

import java.util.Date;

public class DemoMock {
    private String variable = "variable";

    private Date date;

    public String createServiceOne(String field) {
        return new BaseService().selectOne();
    }

    public String callInnerFunc() {
        return innerFunc();
    }

    public String callInnerFunc(String arg) {
        return innerFunc(arg);
    }

    public String callCommonFunc() {
        return commonFunc();
    }

    public String callCommonFunc(String arg) {
        return commonFunc(arg);
    }

    public String commonFunc() {
        return "_COMMON_FUNC";
    }

    public String commonFunc(String arg) {
        return "_COMMON_FUNC" + "-" + arg;
    }

    private String innerFunc() {
        return "_INNER_FUNC";
    }

    private String innerFunc(String arg) {
        return "_INNER_FUNC" + "-" + arg;
    }
}
