//Example 1
class Palindrome {

    private static boolean palindromeChecker(String original){
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            //System.out.println(reverse);
        }
        if (original.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        System.out.println(palindromeChecker("civic")); //prints true
        System.out.println(palindromeChecker("media")); //prints false
    }
}


//Example 2
class Palindrome2 {

    private static boolean palindromeChecker(int number){
        int remainder;
        int sum=0;
        int temp=number;

        while (number>0){
            remainder = number%10;
            sum = (sum*10) + remainder;
            number = number/10;
        }

        if (temp==sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        System.out.println(palindromeChecker(545)); //prints true
        System.out.println(palindromeChecker(934)); //prints false
    }
}