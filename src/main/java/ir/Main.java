package ir;

import ir.arrayindex.ArrayIndex;
import ir.binarysearch.BinarySearch;
import ir.pattern.PrintPattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] a = new Integer[]{ 22 , 20 , 15 , 1 ,  9  , 12 , 5 , 25  , 46 };

        //PrintPattern.printStar(100);

        //System.out.println(BinarySearch.binarySearch(a, 20));

        ArrayIndex.remove(a, 0);

        System.out.println(Arrays.toString(a));
    }
}


