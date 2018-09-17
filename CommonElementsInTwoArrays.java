import java.util.*;

class CommonElementsInTwoArrays {

    static int[] findDuplicates(int[] arr1, int[] arr2) {

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int loopMax;

        if (arr1Length>=arr2Length){
            loopMax = arr1Length;
        } else {
            loopMax = arr2Length;
        }



        int i = 0;
        int[] intermediateArray = new int[loopMax];

        for (int j=0; j<loopMax; j++){
            if(Arrays.binarySearch(arr2, arr1[j]) > -1){
                intermediateArray[i] = arr1[j];
                i++;
            }
        }

        int[] result = new int[i];

        for (int j=0; j<i; j++){
            result[j] = intermediateArray[j];
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5, 6, 7};
        int[] arr2 = {3, 6, 7, 8, 20};
        //expected output: [3, 6, 7]
        findDuplicates (arr1, arr2);

    }

}