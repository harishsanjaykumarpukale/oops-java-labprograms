package com.jetbrains.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> colorList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true){
            System.out.print("Press \n 1 for adding colors \n 2 for copy \n 3 for reverse \n 4 for sublist \n 5 for sorting \n 6 for clone \n 7 for exit \n :");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("how many colors are you adding:");
                    int n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the colors");
                    for (int i = 0; i < n; i++)
                        colorList.add(scanner.nextLine());
                    System.out.println("The color list is : " + colorList);
                    break;
                case 2:
                    String[] colorListArray = new String[colorList.size()];
                    colorList.toArray(colorListArray);
                    System.out.println("The color list array is: ");
                    for (String color : colorListArray)
                        System.out.println(color);
                    break;
                case 3:
                    ArrayList<String> revColorList = new ArrayList<String>();
                    for (int i = colorList.size()-1 ; i >=0 ; i--)
                        revColorList.add(colorList.get(i));
                    System.out.println("The color list is : " + revColorList);
                    break;
                case 4:
                    System.out.println("Enter the from position (inclusive):");
                    int fromIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Enter the to position (exclusive):");
                    int toIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if(fromIndex>toIndex || toIndex > colorList.size()-1){
                        System.out.println("You have entered incorrect position(s)");
                        break;
                    }
                    List<String> subList = colorList.subList(fromIndex,toIndex);
                    System.out.println("The sub list is : " + subList);
                    break;
                case 5:
                    Collections.sort(colorList);
                    System.out.println("The sorted list is : " + colorList);
                    break;
                case 6:
                    ArrayList<String> cloneList = (ArrayList<String>) colorList.clone();
                    System.out.println("The cloned list is : " + cloneList);
                    break;
                case 7:
                default:
                    System.exit(0);
            }
        }


    }
}
