package array;

/**
 * @author lanqilu
 * @package array
 * @date Created in 2020/07/29  08:07
 * @description 一维数组的使用
 **/
public class Array {
    public static void main(String[] args) {

        //一维数组的声明和初始化
        //声明
        int[] ids;
        //静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        //也是正确的写法，通过类型推断
        int[] array = {1, 2, 3, 4, 5};
        //总结：数组一旦初始化完成，其长度就确定了。

    }
}
