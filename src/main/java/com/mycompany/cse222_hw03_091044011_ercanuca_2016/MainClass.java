/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw03_091044011_ercanuca_2016;

import java.util.LinkedList;
import java.util.List;

/**
 * main Method Class
 * @version Netbeans IDE 8.0.2 
 * @author ercan
 */
public class MainClass {
    
    /**
     *
     * @param args
     */
    public static void main(String [] args){
          
        tester1();
        
        tester2();    
        
        tester3();
               
    }
    
    private static void tester1(){
        System.out.println("----------------------Tester I--------------------");
        System.out.println("----------------------INTEGERS--------------------");
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Integer and add 7 elements like above.\n" + 
               "SpecList<Integer> specific = new SpecList<>();\n" +
               "        specific.add(1);\n" +
               "        specific.add(2);\n" +
               "        specific.add(5);\n" +
               "        specific.add(4);\n" +
               "        specific.add(0);\n" +
               "        specific.add(2);\n" +
               "        specific.add(3);\n");
        SpecList<Integer> specific = new SpecList<>();
        specific.add(1);
        specific.add(2);
        specific.add(5);
        specific.add(4);
        specific.add(0);
        specific.add(2);
        specific.add(3);


        
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Integer and add 5 elements like above.\n" + 
               " SpecList<Integer> specific2 = new SpecList<>();\n" +
               "        specific2.add(0);\n" +
               "        specific2.add(10);\n" +
               "        specific2.add(20);\n" +
               "        specific2.add(30);\n" +
               "        specific2.add(40);\n");
        SpecList<Integer> specific2 = new SpecList<>();
        specific2.add(0);
        specific2.add(10);
        specific2.add(20);
        specific2.add(30);
        specific2.add(40);
        
        System.out.println("Called addAllAtHead like specific2.addAllAtHead(specific);"
                            + " and show return value.");
        System.out.println("addAllAtHead returned value: " + specific2.addAllAtHead(specific));
        
        System.out.println("Called specific2 toString method");
        System.out.println(specific2.toString());
        System.out.println("----------------------DOUBLES--------------------");
        // Create specificList Class object type of Double and add 7 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Double and add 7 elements like above.\n" + 
               "SpecList<Double> specific3 = new SpecList<>();\n" +
               "        specific3.add(1.1);\n" +
               "        specific3.add(2.5);\n" +
               "        specific3.add(5.6);\n" +
               "        specific3.add(4.5);\n" + 
               "        specific3.add(0.7);\n" +
               "        specific3.add(2.8);\n" +
               "        specific3.add(3.8);\n");
        SpecList<Double> specific3 = new SpecList<>();
        specific3.add(1.1);
        specific3.add(2.5);
        specific3.add(5.6);
        specific3.add(4.5);
        specific3.add(0.7);
        specific3.add(2.8);
        specific3.add(3.8);


        
        // Create specificList Class object type of Double and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Double and add 5 elements like above.\n" + 
               " SpecList<Double> specific4 = new SpecList<>();\n" +
               "        specific4.add(1.0);\n" +
               "        specific4.add(10.78);\n" +
               "        specific4.add(20.77);\n" +
               "        specific4.add(30.44);\n" +
               "        specific4.add(40.99);\n");
        SpecList<Double> specific4 = new SpecList<>();
        specific4.add(1.0);
        specific4.add(10.78);
        specific4.add(20.77);
        specific4.add(30.44);
        specific4.add(40.99);
        
        System.out.println("Called addAllAtHead like specific4.addAllAtHead(specific3);"
                            + " and show return value.");
        System.out.println("addAllAtHead returned value: " + specific4.addAllAtHead(specific3));
        
        System.out.println("Called specific4 toString method");
        System.out.println(specific4.toString());
        
        System.out.println("----------------------STRINGS--------------------");
        // Create specificList Class object type of String and add 4 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of String and add 4 elements like above.\n" + 
               "SpecList<String> specific5 = new SpecList<>();\n" +
               "        specific5.add(\"ali\");\n" +
               "        specific5.add(\"can\");\n" +
               "        specific5.add(\"sardar\");\n" +
               "        specific5.add(\"kenan\");\n");
        SpecList<String> specific5 = new SpecList<>();
        specific5.add("ali");
        specific5.add("can");
        specific5.add("serdar");
        specific5.add("kenan");

        // Create specificList Class object type of String and add 3 elements.
        System.out.println("Created another specificList Class object"
                           + " type of String and add 3 elements like above.\n" + 
               " SpecList<String> specific6 = new SpecList<>();\n" +
               "        specific6.add(\"elif\");\n" +
               "        specific6.add(\"salih\");\n" +
               "        specific6.add(\"Yusuf\");\n");
        SpecList<String> specific6 = new SpecList<>();
        specific6.add("elif");
        specific6.add("salih");
        specific6.add("yusuf");
       
        
        System.out.println("Called addAllAtHead like specific6.addAllAtHead(specific5);"
                            + " and show return value.");
        System.out.println("addAllAtHead returned value: " + specific6.addAllAtHead(specific5));
        
        System.out.println("Called specific6 toString method");
        System.out.println(specific6.toString());
        
        System.out.println("\n----------------------Tester I END--------------------\n\n");
    }
    private static void tester2(){
        System.out.println("----------------------Tester II--------------------");
         System.out.println("----------------------INTEGERS--------------------");
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Integer and add 7 elements like above.\n" + 
               "SpecList<Integer> specific = new SpecList<>();\n" +
               "        specific.add(1);\n" +
               "        specific.add(2);\n" +
               "        specific.add(5);\n" +
               "        specific.add(4);\n" +
               "        specific.add(0);\n" +
               "        specific.add(2);\n" +
               "        specific.add(3);\n");
        SpecList<Integer> specific = new SpecList<>();
        specific.add(1);
        specific.add(2);
        specific.add(5);
        specific.add(4);
        specific.add(0);
        specific.add(2);
        specific.add(3);


        
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Integer and add 5 elements like above.\n" + 
               " SpecList<Integer> specific2 = new SpecList<>();\n" +
               "        specific2.add(0);\n" +
               "        specific2.add(1);\n" +
               "        specific2.add(2);\n" +
               "        specific2.add(3);\n" +
               "        specific2.add(4);\n");
        SpecList<Integer> specific2 = new SpecList<>();
        specific2.add(0);
        specific2.add(1);
        specific2.add(2);
        specific2.add(3);
        specific2.add(4);
        
        // Initialzation the getIntersectList to the List Class Object 
        System.out.println("Initialzation to getIntersectList the List Class Object.\n"
                + "List<Integer> list1 = (LinkedList<Integer>) specific.getIntersectList(specific2);\n");
        LinkedList<Integer> list1 =  (LinkedList<Integer>) specific.getIntersectList(specific2);
        System.out.println("Called list1 toString method");
        System.out.println(list1.toString());
        
         System.out.println("----------------------DOUBLES--------------------");
        // Create specificList Class object type of Double and add 7 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Double and add 7 elements like above.\n" + 
               "SpecList<Double> specific3 = new SpecList<>();\n" +
               "        specific3.add(1.0);\n" +
               "        specific3.add(2.5);\n" +
               "        specific3.add(5.6);\n" +
               "        specific3.add(4.5);\n" + 
               "        specific3.add(0.7);\n" +
               "        specific3.add(20.7);\n" +
               "        specific3.add(3.4);\n");
        SpecList<Double> specific3 = new SpecList<>();
        specific3.add(1.0);
        specific3.add(2.5);
        specific3.add(5.6);
        specific3.add(4.5);
        specific3.add(0.7);
        specific3.add(20.7);
        specific3.add(3.4);


        
        // Create specificList Class object type of Double and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Double and add 5 elements like above.\n" + 
               " SpecList<Double> specific4 = new SpecList<>();\n" +
               "        specific4.add(1.0);\n" +
               "        specific4.add(10.78);\n" +
               "        specific4.add(20.7);\n" +
               "        specific4.add(3.4);\n" +
               "        specific4.add(40.99);\n");
        SpecList<Double> specific4 = new SpecList<>();
        specific4.add(1.0);
        specific4.add(10.78);
        specific4.add(20.7);
        specific4.add(3.4);
        specific4.add(40.99);
        
        // Initialzation the getIntersectList to the List Class Object 
        System.out.println("Initialzation to getIntersectList the List Class Object.\n"
                + "List<Double> list2 = (LinkedList<Double>) specific4.getIntersectList(specific3);\n");
        LinkedList<Double> list2 =  (LinkedList<Double>) specific4.getIntersectList(specific3);
        System.out.println("Called list2 toString method");
        System.out.println(list2.toString());
        
        System.out.println("----------------------STRINGS--------------------");
        // Create specificList Class object type of String and add 4 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of String and add 4 elements like above.\n" + 
               "SpecList<String> specific5 = new SpecList<>();\n" +
               "        specific5.add(\"yusuf\");\n" +
               "        specific5.add(\"can\");\n" +
               "        specific5.add(\"elif\");\n" +
               "        specific5.add(\"kenan\");\n");
        SpecList<String> specific5 = new SpecList<>();
        specific5.add("yusuf");
        specific5.add("can");
        specific5.add("elif");
        specific5.add("kenan");

        // Create specificList Class object type of String and add 3 elements.
        System.out.println("Created another specificList Class object"
                           + " type of String and add 3 elements like above.\n" + 
               " SpecList<String> specific6 = new SpecList<>();\n" +
               "        specific6.add(\"elif\");\n" +
               "        specific6.add(\"salih\");\n" +
               "        specific6.add(\"Yusuf\");\n");
        SpecList<String> specific6 = new SpecList<>();
        specific6.add("elif");
        specific6.add("salih");
        specific6.add("yusuf");
       
       // Initialzation the getIntersectList to the List Class Object 
        System.out.println("Initialzation to getIntersectList the List Class Object.\n"
                + "List<String> list2 = (LinkedList<String>) specific5.getIntersectList(specific6);\n");
        LinkedList<String> list3 =  (LinkedList<String>) specific5.getIntersectList(specific6);
        System.out.println("Called list3 toString method");
        System.out.println(list3.toString());
        System.out.println("\n----------------------Tester II END--------------------\n\n");
        
    }
    private static void tester3(){
        System.out.println("----------------------Tester III--------------------");
        System.out.println("----------------------INTEGERS--------------------");
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Integer and add 7 elements like above.\n" + 
               "SpecList<Integer> specific = new SpecList<>();\n" +
               "        specific.add(1);\n" +
               "        specific.add(2);\n" +
               "        specific.add(5);\n" +
               "        specific.add(4);\n" +
               "        specific.add(0);\n" +
               "        specific.add(2);\n" +
               "        specific.add(3);\n");
        SpecList<Integer> specific = new SpecList<>();
        specific.add(1);
        specific.add(2);
        specific.add(5);
        specific.add(4);
        specific.add(0);
        specific.add(2);
        specific.add(3);

        System.out.println("Called specific toString method");
        System.out.println(specific.toString());
        System.out.println("Called specific sorting with decreasing method");
        System.out.println(specific.sortList(0));
        
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Integer and add 5 elements like above.\n" + 
               " SpecList<Integer> specific2 = new SpecList<>();\n" +
               "        specific2.add(55);\n" +
               "        specific2.add(20);\n" +
               "        specific2.add(24);\n" +
               "        specific2.add(37);\n" +
               "        specific2.add(40);\n");
        SpecList<Integer> specific2 = new SpecList<>();
        specific2.add(55);
        specific2.add(20);
        specific2.add(24);
        specific2.add(37);
        specific2.add(40);
        
        System.out.println("Called specific2 toString method");
        System.out.println(specific2.toString());
        System.out.println("Called specific2 sorting with increasing method");
        System.out.println(specific2.sortList(1));
        
         System.out.println("----------------------DOUBLES--------------------");
        // Create specificList Class object type of Double and add 7 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Double and add 7 elements like above.\n" + 
               "SpecList<Double> specific3 = new SpecList<>();\n" +
               "        specific3.add(1.1);\n" +
               "        specific3.add(2.5);\n" +
               "        specific3.add(5.6);\n" +
               "        specific3.add(4.5);\n" + 
               "        specific3.add(0.7);\n" +
               "        specific3.add(2.8);\n" +
               "        specific3.add(3.8);\n");
        SpecList<Double> specific3 = new SpecList<>();
        specific3.add(1.1);
        specific3.add(2.5);
        specific3.add(5.6);
        specific3.add(4.5);
        specific3.add(0.7);
        specific3.add(2.8);
        specific3.add(3.8);
        
        System.out.println("Called specific3 toString method");
        System.out.println(specific3.toString());
        System.out.println("Called specific3 sorting with increasing method");
        System.out.println(specific3.sortList(1));
        
        // Create specificList Class object type of Double and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of Double and add 5 elements like above.\n" + 
               " SpecList<Double> specific4 = new SpecList<>();\n" +
               "        specific4.add(1.0);\n" +
               "        specific4.add(10.78);\n" +
               "        specific4.add(20.77);\n" +
               "        specific4.add(30.44);\n" +
               "        specific4.add(40.99);\n");
        SpecList<Double> specific4 = new SpecList<>();
        specific4.add(1.0);
        specific4.add(10.78);
        specific4.add(20.77);
        specific4.add(30.44);
        specific4.add(40.99);
        
        System.out.println("Called specific4 toString method");
        System.out.println(specific4.toString());
        System.out.println("Called specific4 sorting with decreasing method");
        System.out.println(specific4.sortList(0));
        
        System.out.println("----------------------STRINGS--------------------");
        // Create specificList Class object type of String and add 4 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of String and add 4 elements like above.\n" + 
               "SpecList<String> specific5 = new SpecList<>();\n" +
               "        specific5.add(\"ali\");\n" +
               "        specific5.add(\"can\");\n" +
               "        specific5.add(\"sardar\");\n" +
               "        specific5.add(\"kenan\");\n");
        SpecList<String> specific5 = new SpecList<>();
        specific5.add("ali");
        specific5.add("can");
        specific5.add("serdar");
        specific5.add("kenan");

        System.out.println("Called specific5 toString method");
        System.out.println(specific5.toString());
        System.out.println("Called specific5 sorting with decreasing method");
        System.out.println(specific5.sortList(0));
        
        // Create specificList Class object type of String and add 4 elements.
        System.out.println("Created another specificList Class object"
                           + " type of String and add 4 elements like above.\n" + 
               " SpecList<String> specific6 = new SpecList<>();\n" +
               "        specific6.add(\"elif\");\n"  +
               "        specific6.add(\"zeynep\");\n" +
               "        specific6.add(\"salih\");\n" +
               "        specific6.add(\"Yusuf\");\n");
        SpecList<String> specific6 = new SpecList<>();
        specific6.add("elif");
        specific6.add("zeynep");
        specific6.add("salih");
        specific6.add("yusuf");
       
        System.out.println("Called specific6 toString method");
        System.out.println(specific6.toString());
        System.out.println("Called specific6 sorting with increasing method");
        System.out.println(specific6.sortList(1));
        
        System.out.println("\n----------------------Tester III END--------------------\n\n");

    }
    
}
