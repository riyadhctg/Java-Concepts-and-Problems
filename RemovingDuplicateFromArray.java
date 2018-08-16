import java.util.Arrays;

public class RemovingDuplicateFromArray {

    public static void main (String[] args){

        int[] arrayOfNumber = {5,1,4,5,4,8,6,7,7,8,8,8,8};
        removingDuplicateFromArray(arrayOfNumber);

    }

    public static void removingDuplicateFromArray (int[] initialArray) {

        Arrays.sort(initialArray);
        System.out.println("Initial Array: " + Arrays.toString(initialArray));

        int initialArrayLength = initialArray.length;
        int[] intermediateArray = new int[initialArrayLength];
        int finalArrayLength = 0;

        for(int i = 0; i<initialArray.length; i++){
            if((initialArray.length-i)>1){
                int nextInt = initialArray[i+1];
                if (initialArray[i] != nextInt){
                    if (i==0) {
                        intermediateArray[i] = initialArray[i];
                        finalArrayLength++;
                    }
                    intermediateArray[i+1] = nextInt;
                    finalArrayLength++;
                }
            }
        }

        System.out.println("Intermediate Array: " + Arrays.toString(intermediateArray));

        int finalArray[] = new int[finalArrayLength];

        for (int i = 0, j=0; i<intermediateArray.length; i++){
            if(intermediateArray[i] != 0){
                finalArray[j] = initialArray [i];
                j++;
            }
        }

        System.out.println("Final Array: " + Arrays.toString(finalArray));

    }

}
