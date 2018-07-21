package PropertyDescriptor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author 小武 on 2018/7/21.
 */
public class TestPropertyDescriptor {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(18);
        getFiled(person, "name");//结果输出 zhangsan
    }

    // 通过反射得到name
    // 可以看到这是通过 得到 属性的get方法（pd.getReadMethod()） 再调用invole方法取出对应的属性值
    //同样得到set方法（pd.getWriteMethod()）
    private static void getFiled(Object object, String field) {
        Class<? extends Object> clazz  = object.getClass();
        PropertyDescriptor pd = null;
        Method getMethod = null;
        try {
            pd = new PropertyDescriptor(field, clazz);
            if (null != pd) {
                // 获取  这个 field 属性 的get方法
                getMethod = pd.getReadMethod();
                Object invoke = getMethod.invoke(object);
                System.out.println(invoke);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
