/**
 * A positive number is called Armstrong number if it is
 * equal to the sum of cubes of its digits for example 0, 1, 153, 370.
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 */

class ArmstrongExample{

    private static boolean isArmstrong(int number){
        int temp = number;
        int remainder;
        int sum = 0;

        while (number>0){
            remainder = number%10; //for 153: 3, 5, 1
            number = number/10; //for 153: 15, 1, 0
            sum = sum + (remainder*remainder*remainder); //for 153: 0+(3*3*3), 27+(5*5*5), 27+125+(1*1*1)
        }
        if (sum==temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args)  {
        System.out.println(isArmstrong(153)); //true
        System.out.println(isArmstrong(296)); //false
    }
}  