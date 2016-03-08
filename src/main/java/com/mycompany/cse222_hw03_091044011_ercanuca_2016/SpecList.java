/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cse222_hw03_091044011_ercanuca_2016;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Specific class extends LinkedList and comparable elements
 * @author ercan
 * @version Netbeans IDE 8.0.2 
 * @param <E> it is comparable generics elements
 */
public class SpecList<E extends Comparable<E>> extends LinkedList<E>{
    
    /**
     * Default constructors for SpecList Class
     * And call the default constructor of the LinkedList
     */
    public SpecList() {
        super();
    }
    /**
     * One parameter Constructor of SpecList Class
     * And call the one parameter constructor of the LinkedList 
     * @param c Collection class type, generic type is E
     */
    public SpecList(Collection<? extends E> c) {
            super(c);    
    }
   
    /**
     * Appends all of the elements in the specified collection to the head of the list.
       addFirst working Constant time O(1), for loop n-1 times so time complexity is O(n) time
     * @param c Collection class type, generic type is E
     * @return if addAllatHead method is addAll elements true, otherwise handling exception and return false;
     */
   public boolean addAllAtHead(Collection<? extends E> c){
       try{
           LinkedList<E> link = (LinkedList<E>) c;
           for (int i = link.size()-1; i >=0 ; i--) {
                  addFirst(link.get(i));
           }  
       }
       catch(NullPointerException     |
             ClassCastException       | 
             IllegalStateException    | 
             IllegalArgumentException |
             IndexOutOfBoundsException exp)
       {
           exp.printStackTrace(System.err);
           return false;
       }
       return true;
    }    

    /**
     * Finds and returns intersection list (list of unique elements available in both collections) 
       LinkedList get method take O(n) time and contains take O(n) time too,
       for size times working total time of method is size*O(n)*O(n) is O(n^3),
       namely the method complexiy is O(n^3) time.
     * @param c Collection class type, generic type is E
     * @return the intersection of LinkedLists
     */
    public List<E> getIntersectList (Collection<? extends E> c){
        // Handling for ClassCast_intersectionList,contains,add,get methods throws
        try{ 
            LinkedList<E> intersectionlist = (LinkedList<E>) c;
            LinkedList<E> returnList = new LinkedList<>();

            for (int i=0; i< intersectionlist.size() ; i++)
                {  
                  if(this.contains(intersectionlist.get(i)) && !returnList.contains(intersectionlist.get(i)))
                      returnList.add(intersectionlist.get(i));

                }
            return returnList;

          }catch(NullPointerException          |
                 ClassCastException            | 
                 IllegalStateException         | 
                 IllegalArgumentException      |
                 UnsupportedOperationException |
                 IndexOutOfBoundsException exp)
          {
            exp.printStackTrace(System.err);
            return null;
          } 
        
    }
   /**
     * Sorts and returns list (using cocktail sort algorithm)
       LinkedList get method take O(n) time,
       for size times working total time of method is O(n/2)*O(n-1)*O(n) is O(n^3),
       namely the method complexiy is O(n^3) time.
     * @param sorting if it is 1 increasing sort, else decreasing.
     * @return the sorted increasing or decreasing list, select by sorting parameter.
     */
     public List<E> sortList(int sorting){
        // Handling for  get and set methods throws
        try{
            if (sorting == 1) { // increasing sort
             for (int i = 1; i <= this.size() / 2; i++) { // phase i of shaker sort    
                 for (int j = i - 1; j < this.size() - i; j++) { // first do left to right bubbling pass
                     if (this.get(j).compareTo(this.get(j + 1)) > 0) {
                         E temp = this.get(j);
                         this.set(j, this.get(j + 1));
                         this.set(j + 1, temp);
                     }
                 }
                 for (int j = this.size() - i; j >= i; j--) { // now do right to left bubbling pass
                     if (this.get(j).compareTo(this.get(j - 1)) < 0) {
                         E temp = this.get(j);
                         this.set(j, this.get(j - 1));
                         this.set(j - 1, temp);
                     }
                 }
             } // end first for that after if      
            }else { // decreasing sort
                for (int i = this.size() / 2; i >= 1; i--) {  // phase i of shaker sort
                    for (int j = this.size() - i; j >= i; j--) { // first do left to right bubbling pass
                        if (this.get(j).compareTo(this.get(j - 1)) > 0) {
                            E temp = this.get(j);
                            this.set(j, this.get(j - 1));
                            this.set(j - 1, temp);
                        }
                    }
                    for (int j = i - 1; j < this.size() - i; j++) { // now do right to left bubbling pass
                        if (this.get(j).compareTo(this.get(j + 1)) < 0) {
                            E temp = this.get(j);
                            this.set(j, this.get(j + 1));
                            this.set(j + 1, temp);
                        }
                    }         
               }
            }  // end first for that after else 
        }catch(NullPointerException          |
               ClassCastException            | 
               IllegalArgumentException      |
               UnsupportedOperationException |
               IndexOutOfBoundsException exp)
        {
            
            exp.printStackTrace(System.err);
            return null;
        } 
        
        return this;    
    }

    @Override
    public String toString() {
        return "SpecList{"  +  super.toString() + '}';
    }
}
