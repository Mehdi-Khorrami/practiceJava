package ir.arrayindex;

public class ArrayIndex {

    public static void remove(Integer[] arr ,  int index){
        if(arr.length == 0 ) {
            System.out.println("array is null");
        }
        arr[index] = 0;
        shiftArray(arr);
    }


    public static Integer[]  shiftArray(Integer[] arr){
        Integer[] result = new Integer[arr.length - 1];
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
}
