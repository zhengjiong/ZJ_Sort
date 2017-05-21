package com.zj.example.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * compareto就是比较两个数据的大小关系
 * 大于0表示前一个数据比后一个数据大，
 * 0表示相等，小于0表示第一个数据小于第二个数据
 *
 * Created by zj on 2017/5/21.
 */
public class Demo1_List {

    public static void main(String[] args){
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(new Integer(3));
        linkedList1.add(new Integer(1));
        linkedList1.add(new Integer(9));
        linkedList1.add(new Integer(4));

		/*
		 * 然后使用Collections类来排序
		 */
        //定义Comparator(排序规则,Cllections.sort()方法使用的参数),使用Collections类提供的排序规则
        Comparator comparator = Collections.reverseOrder();//反转排序
        Collections.sort(linkedList1, comparator);

        System.out.println(linkedList1);


        //打乱顺序
        Collections.shuffle(linkedList1);
        System.out.println("打乱顺序 "+linkedList1);

        //最大值,最小值
        System.out.println("最大值:" + Collections.max(linkedList1));
        System.out.println("最小值:" + Collections.min(linkedList1));
    }
}
