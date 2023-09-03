package ir.calculator;
import java.util.Arrays;

public class StringCalculator extends  GeneralCalculator<String>{

    public StringCalculator(String[] arr) {
        super(arr);
    }

    @Override
    public void add(String item) {
        String[] result = new String[arr.length+1];
        for (int i = 0 ; i < arr.length ; i++){
            result[i] =arr[i];
        }
        result[arr.length] = item ;
        this.arr = result ;
    }

    @Override
    public void set(int index, String item) {
        this.arr[index] = item ;
    }

    @Override
    public void remove(int index) {
        this.arr[index] = null;
        shiftArray();
    }

    @Override
    public int compare(String[] b) {
        return -1;
    }

    @Override
    public StringCalculator subArray(int from, int to) {
        if (arr.length == 0 || to < from || from < 0 || from >= arr.length || to >= arr.length) {
            return null;
        }

        String[] result = new String[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = arr[i];
        }
        this.arr = result;
        return new StringCalculator(result);
    }

    @Override
    public StringCalculator reverse() {
        String[] result = new String[arr.length];

        for (int i = arr.length - 1  ; i >= 0;  i --){
            result[arr.length - 1 - i] = arr[i];
        }

        this.arr = result ;

        return new StringCalculator(result);
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) > 0 ;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0 ; i< arr.length ; i++ ){
            if(arr[i] == item){
                return i ;
            }
        }
        return 0;
    }

    @Override
    public boolean compareString(String[] b) {
        if(arr.length != b.length){
            return false;
        }
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "StringCalculator{" +
                "arr=" + Arrays.toString(arr) +
                "} " + super.toString();
    }

    private void shiftArray(){
        int nullIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndex = i;
                break;
            }
        }
        if (nullIndex == -1) {
            return;
        }
        for (int i = nullIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;
        String[] newArray = new String[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArray[i] = arr[i];
        }
        this.arr = newArray;
    }
}
