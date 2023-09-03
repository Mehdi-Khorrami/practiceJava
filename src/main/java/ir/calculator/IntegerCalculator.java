package ir.calculator;

public class IntegerCalculator extends  NumericCalculator<Integer>{


    public IntegerCalculator(Integer[] arr) {
        super(arr);
    }

    @Override
    public Double avg() {
        return sum() / arr.length;
    }

    @Override
    public Double sum() {
        if ( arr == null || arr.length == 0 ) {
            return null;
        }

        Double sum = 0D;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public Integer max() {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    @Override
    public Integer min() {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }


    @Override
    public void add(Integer item) {
        Integer[] result = new Integer[arr.length+1];
        for (int i = 0 ; i < arr.length ; i++){
            result[i] =arr[i];
        }
        result[arr.length] = item ;
        this.arr = result ;
    }

    @Override
    public void set(int index, Integer item) {
        this.arr[index] = item;
    }

    @Override
    public void remove(int index) {
        if(arr.length == 0 ) {
            System.out.println("array is null");
        }
        arr[index] = 0;
    }

    @Override
    public int compare(Integer[] b) {
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] > b[i]){
                return 1;
            } else if (arr[i] < b[i]) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public IntegerCalculator subArray(int from, int to) {
        if (arr.length == 0) {
            return null;
        }
        if (to < from) {
            return null;
        }
        if (from < 0) {
            return null;
        }
        if (from >= arr.length || to >= arr.length) {
            return null;
        }
        Integer[] result = new Integer[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = arr[i];
        }
        return new IntegerCalculator(result);
    }

    @Override
    public IntegerCalculator reverse() {
        Integer[] result = new Integer[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - 1 - i] = arr[i];
        }
        return new IntegerCalculator(result);
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
