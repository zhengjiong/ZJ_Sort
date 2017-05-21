package com.zj.example.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by zj on 2017/5/21.
 */
public class Demo2_List {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(new Integer(3));
        list.add(new Integer(1));
        list.add(new Integer(9));
        list.add(new Integer(4));

        /**
         * Collections.sort默认的是这个方法是升序排列!
         * 返回1表示不交换位置, 返回-1表示交换位置,
         * o2代表前一个对象, o1才代表后一个对象,千万不要弄反了!
         */
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /**
                 * 第一次进入此方法的时候, o2是3, o1才是1,
                 * o1.compareTo(o2)返回结果是o1>o2返回正数, o1<o2返回负数, 如果想等返回0,
                 *
                 * o1.compareTo(o2),相当于1.compareTo(3), 所以肯定返回-1,返回
                 * 负数代表交换位置,所以o1和o2交换位置, 顺序为1, 3,所以是升序排列,
                 *
                 * 第二次进入此方法:o1变成了9, o2变成了1,
                 * o1.compareTo(o2),相当于9.compareTo(1), 所以肯定返回1,返回1表示不交换位置,
                 *
                 * 打印如下所示:
                 * o1=1 ,o2=3 ,result=-1
                 * o1=9 ,o2=1 ,result=1
                 * o1=9 ,o2=3 ,result=1
                 * o1=4 ,o2=3 ,result=1
                 * o1=4 ,o2=9 ,result=-1
                 * [1, 3, 4, 9]
                 */

                int result = o1.compareTo(o2);
                System.out.println("o1=" + o1 + " ,o2="+o2 + " ,result=" + result);
                return result;
            }
        });

        System.out.println(list);
    }
}
