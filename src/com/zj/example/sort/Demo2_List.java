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
         * Collections.sortĬ�ϵ��������������������!
         * ����1��ʾ������λ��, ����-1��ʾ����λ��,
         * o2����ǰһ������, o1�Ŵ����һ������,ǧ��ҪŪ����!
         */
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /**
                 * ��һ�ν���˷�����ʱ��, o2��3, o1����1,
                 * o1.compareTo(o2)���ؽ����o1>o2��������, o1<o2���ظ���, �����ȷ���0,
                 *
                 * o1.compareTo(o2),�൱��1.compareTo(3), ���Կ϶�����-1,����
                 * ����������λ��,����o1��o2����λ��, ˳��Ϊ1, 3,��������������,
                 *
                 * �ڶ��ν���˷���:o1�����9, o2�����1,
                 * o1.compareTo(o2),�൱��9.compareTo(1), ���Կ϶�����1,����1��ʾ������λ��,
                 *
                 * ��ӡ������ʾ:
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
