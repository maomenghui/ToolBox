package clone;

import com.alibaba.fastjson.JSON;
import model.User;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CloneUtilsTest {

    @Test
    public void cloneObject() throws IOException, ClassNotFoundException {
        List<User> list = getUsers();
        Collection<User> users = CloneUtils.cloneCollection(list);
        // [{"age":12,"id":1,"name":"true","phone":"a"}]
        System.out.println(JSON.toJSONString(users));
    }

    private List<User> getUsers() {
        List<User> list = new ArrayList();
        User u1 = new User(1, "true", "a", 12);
        list.add(u1);
        return list;
    }

    @Test
    public void cloneCollection() {
        User user = CloneUtils.cloneObject(getUsers().get(0));

        // User{id=1, name='true', phone='a', age=12}
        System.out.println(user.toString());
    }

}