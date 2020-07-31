package com.data.java;

import com.data.bean.Customer;

import java.util.ArrayList;

/**
 * @author lwstart
 * @date 2020/7/31 - 20:34
 *
 * 1、IDEA中代码模块所处的位置：setting- Editor - live Templates / Postfix Completion
 * 2、常用的模板
 */
public class TemplatesTest {


    //模板六： prsf: 可生成 private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String  NATION ="china";


    //模板一：psvm
    public static void main(String[] args) {


        //模板二：sout
        System.out.println("hello!");
        //变形：soutp（方法形参名） / soutm（当前类名.当前方法） /soutv（变量名）/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模块三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter（可生成增强for循环）
        for (String s : arr) {
            System.out.println(s);

        }
        //变形：itar（可生成普通for循环）
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //模板四：list.for（集合的遍历）
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        System.out.println("TemplateTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }

        //变形：xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }
    }

}
