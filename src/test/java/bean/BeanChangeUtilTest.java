package bean;

import model.User;
import org.junit.Test;
import str.StringUtils;

import static org.junit.Assert.*;

public class BeanChangeUtilTest {

    @Test
    public void contrastObj() {
        contrast();
    }

    public <T> void contrast() {
        User u1 = new User(1, "true", "a", 12);
        User u2 = new User(1, "false", "a", 15);
        BeanChangeUtil<T> t = new BeanChangeUtil<T>();
        String str = t.contrastObj(u1, u2);
        if (StringUtils.isEmpty(str)) {
            System.out.println("未有改变");
        } else {
            System.out.println(str);
        }
    }
}