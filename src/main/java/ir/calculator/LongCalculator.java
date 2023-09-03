package ir.calculator;

public  class LongCalculator extends NumericCalculator<Long>{


    public LongCalculator(Long[] arr) {
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
        for (long i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public Long max() {
        if (arr == null || arr.length == 0) {
            return null;
        }
        long max = Long.MIN_VALUE;
        for (long j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    @Override
    public Long min() {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Long min = Long.MAX_VALUE;
        for (long j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }


    @Override
    public void add(Long item) {
        Long[] result = new Long[arr.length+1];
        for (int i = 0 ; i < arr.length ; i++){
            result[i] =arr[i];
        }
        result[arr.length] = item ;
        this.arr = result ;
    }

    @Override
    public void set(int index, Long item) {
        this.arr[index] = item;
    }

    @Override
    public void remove(int index) {
        if(arr.length == 0 ) {
            System.out.println("array is null");
        }
        arr[index] = 0l;
    }

    @Override
    public int compare(Long[] b) {
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
    public LongCalculator subArray(int from, int to) {
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
        Long[] result = new Long[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = arr[i];
        }
        return new LongCalculator(result);
    }

    @Override
    public LongCalculator reverse() {
        Long[] result = new Long[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - 1 - i] = arr[i];
        }
        return new LongCalculator(result);
    }

    @Override
    public boolean contains(Long item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int indexOf(Long item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }


}
