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

        int[] arr = scanner();
        doOperation(arr);




    }

    private static void doOperation(int[] arr) {
        boolean shouldBreak = false;
        while (!shouldBreak) {
            System.out.println("Select one of below commands");
            System.out.println("0) Quit");
            System.out.println("1) Average");
            System.out.println("2) Sum");
            System.out.println("3) remove");
            System.out.println("4) max");
            System.out.println("5) min");
            System.out.println("6) sort");
            System.out.println("7) subArray");
            System.out.println("8) reverse");
            System.out.println("9) indexOf");
            System.out.println("10) contains");

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
                case 3 -> {
                    System.out.println("plesea enter index ");
                    int l = scanner.nextInt();
                    int[] remove = OperationArray.remove(arr ,l );
                    System.out.println("remove is" + Arrays.toString(remove) );
                }
                case 4 -> {
                    Integer max = OperationArray.max(arr);
                    System.out.println("max is " + max );
                }
                case 5 -> {
                    Integer min = OperationArray.min(arr);
                    System.out.println("min is " + min );
                }
                case 6 -> {
                    int[] sort = OperationArray.sort(arr);
                    System.out.println("sort is " + Arrays.toString(sort) );
                }
                case 7 -> {
                    System.out.println("enter from");
                    int from = scanner.nextInt();
                    System.out.println("enter to ");
                    int to = scanner.nextInt();
                    int[] subArray = OperationArray.subArray(arr , from , to);
                    System.out.println("subArray is " + Arrays.toString(subArray) );
                }
                case 8 -> {
                    int[] re = OperationArray.reverse(arr);
                    System.out.println("revers is  " + Arrays.toString(re));
                }
                case 9 -> {
                    System.out.println("plese enter item");
                    int item = scanner.nextInt();
                    int re = OperationArray.indexOf(arr , item);
                    System.out.println("index of is  " + re);
                }
                case 10 -> {
                    System.out.println("plese enter item");
                    int item = scanner.nextInt();
                    boolean re = OperationArray.contains(arr , item);
                    System.out.println("contains  is  " + re);
                }
                default -> System.err.println("Invalid input");
            }
        }
    }

    private static int[] scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input the " + (i + 1) + "th number");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input is " + Arrays.toString(arr));
        return arr;
    }
}

