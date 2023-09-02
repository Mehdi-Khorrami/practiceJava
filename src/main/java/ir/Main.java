package ir;

import ir.arrayindex.ArrayIndex;
import ir.binarysearch.BinarySearch;
import ir.operationinarray.OperationArray;
import ir.pattern.PrintPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int[] a = new int[]{ 22 , 20 , 15 , 1 ,  9  , 12 , 5 , 25  , 46 };

        //PrintPattern.printStar(100);

        //System.out.println(BinarySearch.binarySearch(a, 20));

        //ArrayIndex.remove(a, 0);

        //System.out.println(Arrays.toString(a));



        ArrayList<Integer> arr = scanner();
        doOperation(arr);




    }

    private static void doOperation(ArrayList<Integer> arr) {
        boolean shouldBreak = false;
        while (!shouldBreak) {
            System.out.println("Select one of below commands");
            System.out.println("0) Quit");
            System.out.println("1) Average");
            System.out.println("2) Sum");

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i) {
                case 0 -> {
                    shouldBreak = true;
                }
                case 1 -> {
                    double avg = OperationArray.average(arr);
                    System.out.println("Average is " + avg);
                }
                case 2 -> {
                    Long sum = OperationArray.sum(arr);
                    System.out.println("Sum is " + sum);
                }
                default -> System.err.println("Invalid input");
            }
        }
    }

    private static ArrayList<Integer> scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array items ");
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        ArrayList<Integer> ints = new ArrayList<>();

        for (String string : strings) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println("Input is " + ints);
        return ints;
    }
}


