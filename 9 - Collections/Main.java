package com.jetbrains.Collections;

import java.util.*;

class  Arrlist
{
    ArrayList<String> list_Strings = new ArrayList<>();
    // String[] strArr = new String[];
    // ArrayList<String> revArrayList = new ArrayList<String>();


    public void addList()
    {
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("The array list is: "+list_Strings);
    }

    public void toArr() {
        String[] strArr=new String[list_Strings.size()];
        list_Strings.toArray(strArr);
        System.out.println("Created Array content:");
        for (String str : strArr) {
            System.out.println(str+ " ");
        }
        System.out.println();
    }

    public void reverseArrayList()
    {
        // Arraylist for storing reversed elements
        // ArrayList<String> revArrayList = new ArrayList<String>();
        ArrayList<String> rev_list=new ArrayList<>();
        for (int i = list_Strings.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            rev_list.add(list_Strings.get(i));
        }
        for (int i = 0; i < rev_list.size(); i++) {
            System.out.print(rev_list.get(i) + " ");
        }

    }

    public void subListArr()
    {
        //Return portion of the list : fromindex(inclusive)->1,
        //toindex(exclusive)->3
        ArrayList<String> new_color_list1 = new ArrayList<>( list_Strings.subList(1, 3));
        System.out.println("Portion of the list: "+new_color_list1);

    }

    public void sortArr()
    {
        Collections.sort(list_Strings);
        System.out.println("The sorted list is: "+list_Strings);

    }

    public void cloneArr()
    {
        ArrayList<String> cloneList =new ArrayList<> ();
        cloneList=(ArrayList)list_Strings.clone();
        System.out.println("Elements in cloneList are:");
        System.out.println(cloneList);
    }

}

public class Main {
    public static void main(String[] args) {

        Arrlist a1 = new Arrlist();
        a1.addList();
        a1.toArr();
        a1.reverseArrayList();
        a1.subListArr();
        a1.sortArr();
        a1.cloneArr();
    }
}
