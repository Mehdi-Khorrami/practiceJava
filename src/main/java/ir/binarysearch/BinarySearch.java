package ir.binarysearch;

public class BinarySearch {

    public static Integer binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return null;
        }
        sort(arr);
        int mid = arr.length / 2;
        int first = arr[0];
        int last = arr[arr.length - 1];


        while (first <= last) {
            if ( arr[mid] < key ) {
                first = arr[mid++];
            } else if (arr[mid] > key) {
                last = arr[mid--];
            } else {
                break;
            }
        }

        return mid;
    }


    public static int[] sort(int[] arr) {
        int extra;
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    extra = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = extra;

                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }
}
