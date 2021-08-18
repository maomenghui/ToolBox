package bean;

import com.alibaba.fastjson.JSON;
import model.User;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class BeanMapConvertTest {

    @Test
    public void beanToMapObject() {
        Map<String, Object> stringObjectMap = getStringObjectMap();
        System.out.println(JSON.toJSONString(stringObjectMap));
    }

    private Map<String, Object> getStringObjectMap() {
        User u1 = new User(1, "true", "a", 12);
        return BeanMapConvert.beanToMapObject(u1);
    }

    @Test
    public void mapToBean() {
        User user = (User) BeanMapConvert.mapToBean(getStringObjectMap(), new User());
        System.out.println(user.toString());
    }
}