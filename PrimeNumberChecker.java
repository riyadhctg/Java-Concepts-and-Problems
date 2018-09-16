class PrimeNumberChecker {


    private static boolean isPrime(int n) {
        if (n%2==0)
            return false;

        //only check the odds
        for(int i=3;i*i<=n;i+=2) { //we only need to check up to sqrt of n, hence the range
            //System.out.println(i);
            if(n%i==0)
                return false;
        }

        return true;
    }



    public static void main(String[] args) {

        System.out.println(isPrime(29));
        System.out.println(isPrime(57));

    }
}