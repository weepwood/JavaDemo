package sort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author lanqilu
 * @date Created in 2020/08/08  10:58
 * @description 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] whitelist = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29};
        Arrays.sort(whitelist);
        for (int i:whitelist) {
            System.out.print(i + ",");
        }
        System.out.println();
        int key = 84;
        int result = rank(key, whitelist);
        if (result < 0) {
            System.out.println(key+" :未在此数组中");
        }else {
            System.out.println("已查询到: "+key);
            System.out.println("索引为  : "+result);
        }
    }


    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


}
