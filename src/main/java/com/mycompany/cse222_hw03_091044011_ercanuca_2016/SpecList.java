/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cse222_hw03_091044011_ercanuca_2016;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Specific class extends LinkedList and comparable elements
 * @author ercan
 * @version 8.0.2
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
     * @param c Collection class type, generic type is E
     * @return if addAllatHead method is addAll elements true, otherwise false;
     */
   public boolean addAllAtHead(Collection<? extends E> c){
       LinkedList<E> link = (LinkedList<E>) c;
       try{
           for (int i = link.size()-1; i >=0 ; i--) {
                  addFirst(link.get(i));
           }  
       }
       catch(NullPointerException |
               ClassCastException | 
            IllegalStateException | 
            IllegalArgumentException exp){
           exp.printStackTrace(System.err);
           return false;
       }
       return true;
    }    

    /**
     * Finds and returns intersection list (list of unique elements available in both collections) 
     * @param c Collection class type, generic type is E
     * @return the intersection of LinkedLists
     */
    public List<E> getIntersectList (Collection<? extends E> c){
        LinkedList<E> intersectionlist = (LinkedList<E>) c;
        LinkedList<E> returnList = new LinkedList<>();
        
        int size;
        // select bigger size
        if(intersectionlist.size() > size())
            size = intersectionlist.size();
        else
            size = size();
        // Handling for contains and add throws
        try{      
            for (int i=0; i< size ; i++)
            {                
              if(contains(intersectionlist.get(i)) && !returnList.contains(intersectionlist.get(i)))
                  returnList.add(intersectionlist.get(i));

            }
          }catch(NullPointerException     |
                 ClassCastException       | 
                 IllegalStateException    | 
                 IllegalArgumentException |
                 UnsupportedOperationException exp){
            exp.printStackTrace(System.err);
            return null;
          } 
        return returnList;
    }
   /**
     * Sorts and returns list (using cocktail sort algorithm)
     * @param sorting if it is 1 increasing sort, else decreasing.
     * @return the sorted increasing or decreasing list, select by sorting parameter.
     */
     public List<E> sortList(int sorting){
        if (sorting == 1) { // increasing sort
            for (int i = 1; i <= size() / 2; i++) { // phase i of shaker sort    
                for (int j = i - 1; j < size() - i; j++) { // first do left to right bubbling pass
                    if (this.get(j).compareTo(this.get(j + 1)) > 0) {
                        E temp = get(j);
                        set(j, get(j + 1));
                        set(j + 1, temp);
                    }
                }
                for (int j = size() - i; j >= i; j--) { // now do right to left bubbling pass
                    if (this.get(j).compareTo(this.get(j - 1)) < 0) {
                        E temp = get(j);
                        set(j, get(j - 1));
                        set(j - 1, temp);
                    }
                }
            } // end first for that after if      
        } else { // decreasing sort
            for (int i = size() / 2; i >= 1; i--) {  // phase i of shaker sort
                for (int j = size() - i; j >= i; j--) { // first do left to right bubbling pass
                    if (this.get(j).compareTo(this.get(j - 1)) > 0) {
                        E temp = get(j);
                        set(j, get(j - 1));
                        set(j - 1, temp);
                    }
                }
                for (int j = i - 1; j < size() - i; j++) { // now do right to left bubbling pass
                    if (this.get(j).compareTo(this.get(j + 1)) < 0) {
                        E temp = get(j);
                        set(j, get(j + 1));
                        set(j + 1, temp);
                    }
                }         
            }
        }  // end first for that after else
        return this;    
    }

    @Override
    public String toString() {
        return "SpecList{"  +  super.toString() + '}';
    }
}
