package bean;

import com.alibaba.fastjson.JSONObject;
import model.User;
import org.junit.Test;
import str.StringUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 对比对象类
 * @author  maomh
 * @param <T>
 */
public class BeanChangeUtil<T> {

    /**
     * @param oldBean 原对象
     * @param newBean 新对象
     * @return 返回老的对象修改值{"name":"true","age":12}
     */
    public String contrastObj(Object oldBean, Object newBean) {
        JSONObject jsonObject = new JSONObject();
        T pojo1 = (T) oldBean;
        T pojo2 = (T) newBean;
        try {
            // 通过反射获取类的类类型及字段属性
            Class clazz = pojo1.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                // 排除序列化属性
                if ("serialVersionUID".equals(field.getName())) {
                    continue;
                }
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
                // 获取对应属性值
                Method getMethod = pd.getReadMethod();
                Object o1 = getMethod.invoke(pojo1);
                Object o2 = getMethod.invoke(pojo2);
                if (o1 == null && o2 == null) {
                    continue;
                }
                if (o1 == null) {
                    o1 = "";
                }
                if (o2 == null) {
                    continue;
                }
                if (!o1.toString().equals(o2.toString())) {
                    jsonObject.put(field.getName(), o1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jsonObject.isEmpty()) {
            return "";
        }
        return jsonObject.toJSONString();
    }

}