/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw03_091044011_ercanuca_2016;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class SpecListTest {
    
    public SpecListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     /**
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHead() {
        System.out.println("testAddAllAtHead");
        Collection c = new LinkedList();
        boolean itIsTrue = c.add(12);
        SpecList instance = new SpecList(c);   
        boolean expResult = true;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of addAllAtHead method, of class SpecList.
     * Throws NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void testAddAllAtHead_ThrowNullPointerException() {
        System.out.println("testAddAllAtHead_ThrowNullPointerException");
        Collection c = null;
        SpecList instance = null;   // cause of exception
        boolean expResult = false;  
        boolean result = instance.addAllAtHead(c); // it is return false cause of exception
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of addAllAtHead method, of class SpecList.
     * Throws ClassCastException
     */
    @Test(expected = ClassCastException.class)
    public void testAddAllAtHead_ThrowClassCastException() {
        System.out.println("testAddAllAtHead_ThrowClassCastException");
        Collection c = null;
        SpecList<Integer> instance = (SpecList<Integer>) new LinkedList();  // cause of exception
        boolean expResult = false;  
        boolean result = instance.addAllAtHead(c); // it is return false cause of exception
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testGetIntersectList() {
        System.out.println("getIntersectList");
        Collection c = new LinkedList();
        SpecList instance = new SpecList();
        List expResult = new SpecList();
        List result = instance.getIntersectList(c);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIntersectList method, of class SpecList.
     * throws IndexOutOfBoundsException
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIntersectList_IndexOutOfBoundsException() {
        System.out.println("getIntersectList_IndexOutOfBoundsException");
        Collection c = new LinkedList();
        SpecList instance = new SpecList();
        instance.add(12);
        instance.get(2);
        List expResult = null;
        List result = instance.getIntersectList(c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList");
        int sorting = 0;
        SpecList instance = new SpecList();
        List expResult = new SpecList();
        List result = instance.sortList(sorting);
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of sortList method, of class SpecList.
     * throws IndexOutOfBoundsException
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSortList_IndexOutOfBoundsException() {
        System.out.println("sortList_IndexOutOfBoundsException");
        SpecList instance = new SpecList();
        instance.add(11);
        assertEquals(instance.get(1), instance.get(0));  // get throw eden olduğundan  
    }

    /**
     * Test of toString method, of class SpecList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SpecList instance = new SpecList();
        instance.add(12);
        SpecList expResult = new SpecList();
        expResult.add(12);
        String result1 = instance.toString();
        String result2 = expResult.toString();
        assertEquals(result2, result1);

    }
    
}
