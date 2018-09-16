import java.util.Arrays;

class NumberSwapWithoutThirdVariable {

    private static int[] numberSwapper (int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        int[] swappedNumbers = {a, b};
        return swappedNumbers;
    }

    public static void main(String a[])
    {
        System.out.println(Arrays.toString(numberSwapper(5,10)));
    }
}

