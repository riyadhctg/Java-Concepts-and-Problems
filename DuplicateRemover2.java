import java.util.Arrays;

class DuplicateRemover2 {


    public static void main(String args[]) {

        int[] input = {1,1,2,5,5,6,6,6,6,7,8,1};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(removeDuplicates(input)));

    }


    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length]; // int array initialization (all elements initializes to 0)
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int currentNumber = numbersWithDuplicates[i];

            if (previous != currentNumber) {
                result[i] = currentNumber;
            }
            previous = currentNumber;
        }
        return result;

    }
}
