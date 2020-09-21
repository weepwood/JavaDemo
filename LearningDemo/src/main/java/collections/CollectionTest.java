package collections;


import array.Array;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author lanqilu
 * @date Created in 2020/08/15  13:53
 * @description Collection接口中声明的方法的测试
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));


        //contains(Object obj):判断当前集合中是否包含obj
        System.out.println("coll.contains(123) = " + coll.contains(123));
        //判断内容，不是地址 equals
        System.out.println("coll.contains(new String(\"Tom\")) = " + coll.contains(new String("Tom")));
        //没有重写equals,false
        //向 Collection接口的实现类的对象中添加数据obj的，要求obj所在类要重写 equals()
        System.out.println("coll.contains(new Person(\"Jerry\",20)) = " + coll.contains(new Person("Jerry", 20)));

        //containsAll(Collection coll):判断形参coll中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println("coll.containsAll(coll1) = " + coll.containsAll(coll1));

    }

    @Test
    public void test2() {
        //remove()
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        System.out.println("coll = " + coll);
        System.out.println("coll.remove(123) = " + coll.remove(123));
        System.out.println("coll.remove(1234) = " + coll.remove(1234));
        System.out.println("coll = " + coll);

        coll.add(123);
        System.out.println("coll = " + coll);
        //removeAll(Collection coll):从当前集合中移除coll中的所有的元素
        Collection coll1 = Arrays.asList(123, 4567,456);
        coll.removeAll(coll1);
        System.out.println("coll1 = " + coll1);
        System.out.println("coll = " + coll);
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        Collection coll1 = Arrays.asList(123, 4567, 456, 789);

        //求交集
        coll.retainAll(coll1);
        System.out.println("coll = " + coll);

    }
}
