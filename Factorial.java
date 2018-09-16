//Factorial using loop
class FactorialExample{

    private static int factorial (int number){
        int factorial = 1;

        for (int i=1; i<=number; i++){
            factorial = factorial*i;
        }

        return factorial;
    }

    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(factorial(8));
    }
}

//Factorial using recursive function
class FactorialExample2{

    private static int factorial(int number){
        if (number == 0)
            return 1;
        else
            return(number * factorial(number-1));
    }


    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(factorial(9));
    }
}