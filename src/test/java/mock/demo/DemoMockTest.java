package mock.demo;

import com.alibaba.testable.core.accessor.PrivateAccessor;
import com.alibaba.testable.core.annotation.MockMethod;
import com.alibaba.testable.processor.annotation.EnablePrivateAccess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * 只需为测试类添加@EnablePrivateAccess注解，即可在测试用例中获得以下增强能力：
 * 1 调用被测类的私有方法（包括静态方法）
 * 2 读取被测类的私有字段（包括静态字段）
 * 3 修改被测类的私有字段（包括静态字段）
 * 4 修改被测类的常量字段（使用final修饰的字段，包括静态字段）
 */
@EnablePrivateAccess
public class DemoMockTest {

    DemoMock demoMock = new DemoMock();

    @MockMethod(targetClass = DemoMock.class)
    private String innerFunc() {
        return "_MOCK_FUNC";
    }

    @MockMethod(targetClass = DemoMock.class, targetMethod = "innerFunc")
    private String innerFuncMock() {
        return "_MOCK_FUNC";
    }


    @MockMethod(targetClass = DemoMock.class)
    private String innerFunc(String arg) {
        return "_MOCK_FUNC" + "_" + arg;
    }


    @MockMethod(targetClass = DemoMock.class)
    private String commonFunc() {
        return "_MOCK_COMMON";
    }


    @MockMethod(targetClass = DemoMock.class)
    private String commonFunc(String arg) {
        return "_MOCK_COMMON" + "_" + arg;
    }


/*    @MockConstructor
    private String create(String arg) {
        return new BaseService().selectOne("_MOCK_" + arg);
    }*/


    @Test
    void testCallInner() {

        // 覆写`new`操作
        String serviceOne = demoMock.createServiceOne("_WITH_ARG");

        // 访问私有变量
        // String var = demoMock.variable;
        PrivateAccessor.get(demoMock, "variable");
        // 私有变量赋值
        // demoMock.variable = "mock_variable";
        PrivateAccessor.set(demoMock, "variable", "mock_variable");

        PrivateAccessor.get(demoMock, "date");

        PrivateAccessor.set(demoMock, "date", new Date());
        System.out.println(PrivateAccessor.get(demoMock, "date"));

        // 访问私有方法
        // String var1 = demoMock.innerFunc();
        PrivateAccessor.invoke(demoMock, "innerFunc");
        // 访问带参数的私有方法
        // String var2 = demoMock.innerFunc("OK");
        PrivateAccessor.invoke(demoMock, "innerFunc", "OK");

        // mock方法调用
        System.out.println(PrivateAccessor.get(demoMock, "variable"));
        Assertions.assertEquals("_MOCK_FUNC", demoMock.callInnerFunc());
        Assertions.assertEquals("_MOCK_FUNC_OK", demoMock.callInnerFunc("OK"));

        Assertions.assertEquals("_MOCK_COMMON", demoMock.callCommonFunc());
        Assertions.assertEquals("_MOCK_COMMON_OK", demoMock.callCommonFunc("OK"));
    }
}
