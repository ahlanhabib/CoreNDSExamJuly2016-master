package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp, k;
        for(int c=0; c<array.length; c++){
            temp = array[c];
            for ( k = c-1; k >=0 && temp<array[k]; k--) {
                array[k + 1] = array[k];}
            array[k+1] = temp;}

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=1;j<array.length-i; j++){
                if(array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;}
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        divideNumbers(list);
        return list;
    }
    public void divideNumbers(int[] array) {
        int [] list = array;
        if(list.length>1){
            int [] left = right(array);
            int [] right = left(array);
            divideNumbers(left);
            divideNumbers(right);
            merge(left, right); }
    }
    public int [] left(int [] array){
        int size = array.length/2;
        int [] left = new int[size];
        for(int i=0; i<left.length; i++){
            left[i] = array[i];}
        return left;}


    public int [] right(int [] array){
        int size = array.length - array.length/2;
        int [] right = new int[size];
        for(int i=0; i<right.length; i++){
            right[i] = array[array.length/2+i];}
        return right;}

    public static int[] merge(int[] A, int[] B){
        int result[] = new int[A.length+B.length];
        int idex_A = 0;
        int idex_B = 0;
        int idex_result = 0;
        while(idex_A < A.length || idex_B < B.length){
            if(idex_B >= B.length || (idex_A < A.length && A[idex_A] < B[idex_B]))
                result[idex_result++] = A[idex_A++];
            else result[idex_result++] = B[idex_B++];}
        return result;}



















        public int [] heapSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void quickSort(int[] num) {

    }
}
