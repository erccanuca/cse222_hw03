/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw03_091044011_ercanuca_2016;

import java.util.LinkedList;

/**
 *
 * @author ercan
 */
public class MainClass {
    
    public static void main(String [] args){
        
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created specificList Class object"+ 
                           " type of Integer and add 5 elements like above.\n" + 
               "SpecList<Integer> specific = new SpecList<>();\n" +
               "        specific.add(1);\n" +
               "        specific.add(2);\n" +
               "        specific.add(3);\n" +
               "        specific.add(4);\n" +
               "        specific.add(5);\n");
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
        
            
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of String and add 4 elements like above.\n"
                + "SpecList<String> specific3 =  new SpecList<>();\n" +
                "        specific3.add(\"str1\");\n" +
                "        specific3.add(\"str2\");\n" +
                "        specific3.add(\"str2\");\n" +
                "        specific3.add(\"str5\");\n");
        SpecList<String> specific3 =  new SpecList<>();
        specific3.add("str1");
        specific3.add("str2");
        specific3.add("str2");
        specific3.add("str5");
        // Create specificList Class object type of Integer and add 5 elements.
        System.out.println("Created another specificList Class object"
                           + " type of String and add 7 elements like above.\n"
                + "SpecList<String> specific4 =  new SpecList<>();\n" +
                "        specific4.add(\"str2\");\n" +
                "        specific4.add(\"str2\");\n" +
                "        specific4.add(\"str1\");\n" +
                "        specific4.add(\"str1\");\n" +
                "        specific4.add(\"str4\");\n" +
                "        specific4.add(\"str5\");\n" +
                "        specific4.add(\"str1\");\n");
        SpecList<String> specific4 =  new SpecList<>();
        specific4.add("str2");
        specific4.add("str2");
        specific4.add("str1");
        specific4.add("str1");
        specific4.add("str4");
        specific4.add("str5");
        specific4.add("str1");
        // Initialzation the getIntersectList to the List Class Object 
        System.out.println("Initialzation to getIntersectList the List Class Object.\n"
                + "List<String> list = (LinkedList<String>) specific3.getIntersectList(specific4);\n");
        LinkedList<String> list =  (LinkedList<String>) specific3.getIntersectList(specific4);
        System.out.println("Called list toString method");
        System.out.println(list.toString());
        
        System.out.println(specific3.sortList(1));
        
    }
    
}
