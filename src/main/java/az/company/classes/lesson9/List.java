package az.company.classes.lesson9;

import az.company.classes.Array;

import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
       for (int i=0; i<10;i++){
        randomList.add( (int) (Math.random() * (20)) - 10);
       }
        System.out.println("Original: "+randomList);
        Set<Integer> unique = new HashSet<Integer>(randomList);
        System.out.println("Unique: "+unique);
        TreeSet<Integer> mySet = new TreeSet<>(unique);
        System.out.println("Sorted: "+mySet);
        ArrayList<String>personList=new ArrayList<String>();
        personList.add("Zeynab");
        personList.add("Nazrin");
        personList.add("Aflatun");
        personList.add("Alexey");
     ArrayList<String>chooserRand =new ArrayList<String>();
int pos=personList.indexOf( (int) (Math.random() * (4)));

     }
    }

