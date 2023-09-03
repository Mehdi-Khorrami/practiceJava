package ir.operationinarray;
import ir.binarysearch.BinarySearch;
import java.util.Random;

public class OperationArray {

    public static Long sum(int[] arr){
        if ( arr == null || arr.length == 0 ) {
            return null;
        }

        Long sum = 0L;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] arr){
        return sum(arr) / arr.length;
    }

    public static int[] remove(int[] arr ,  int index){
        if(arr.length == 0 ) {
            System.out.println("array is null");
        }
        arr[index] = 0;
        return shiftArray(arr);
    }
    public static int[] shiftArray(int[] arr){
        int[] result = new int[arr.length - 1];
        Integer index = null;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                index = i ;
                break;
            }
        }

        if (index == null){
            return null;
        }

        for (int i = index ; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }

        for (int i =0 ; i < result.length ; i++){
            result[i] = arr[i];
        }

        return result;

    }

    public static Integer max(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static Integer min(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int[] of(int... a) {
        return a;
    }

    public static int[] randomArray(int n) {
        if (n <= 0) {
            return null;
        }
        int[] result = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            result[i] = random.nextInt();
        }
        return result;
    }

    public static int compare(int[] a, int[] b) {
        int n = min(of(a.length, b.length));
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        return Integer.compare(a.length, b.length);
    }

    public static int[] sort(int[] arr) {
        return BinarySearch.sort(arr);
    }

    public static int[] subArray(int[] a, int from, int to) {
        if (a.length == 0 || to < from || from < 0 || from >= a.length || to >= a.length) {
            return null;
        }

        int[] result = new int[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = a[i];
        }
        return result;
    }


    public static boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        if (a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            result[a.length - 1 - i] = a[i];
        }
        return result;
    }

    public static int indexOf(int[] a, int item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] a, int item) {
        return indexOf(a, item) >= 0;
    }

    private static boolean isPrime(int i) {
        int count = 0;
        for (int j = 1; j <= (i / 2); j++) {
            if (i % j == 0) {
                count++;
            }
        }
        return count == 1;
    }

}
