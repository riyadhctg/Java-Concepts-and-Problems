//Find the frequency of each character
class FrequencyOfCharacter {

    static final int SIZE = 26; //number of alphabets

    private static void printCharWithFreq(String str)
    {

        int n = str.length();
        // to store the frequency of each alphabet
        // because of this initialization, we have an int array with 26 zeros.
        int[] freq = new int[SIZE];


        for (int i = 0; i < n; i++) {
            /* str.charAt(i) gives the char of 'i' index in str.
            at (str.charAt(i) - 'a'), because we are using arithmetic operator with chars,
            char values converted to int. For instance, if str.charAt(i) = 'd',
            d's int value is '100'. When we do 'd' - 'c', we actually do 100-97=3.
            Hence, for str.charAt(i)=d, we will have freq[3]. This shifts the
            ASCII code to alphabetical range [0-25], which serves the purpose of
            storing things in our array.
            Initially, all 26 freq[] elements were 0.
            If freq[3] occurs once (or 'd' occurs once), we will have freq[3]=freq[3]+1=0+1=1.
            If we encounter freq[3] twice, we'll have freq[3]=freq[3]+1=1+1=2.
            */
            freq[str.charAt(i) - 'a'] = freq[str.charAt(i) - 'a'] + 1;
        }
        // traverse 'str' from left to right
        for (int i = 0; i < n; i++) {

            if (freq[str.charAt(i) - 'a'] != 0) {

                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");

                // update frequency of str.charAt(i) to 
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }

    public static void main(String args[])
    {
        String str = "hello";
        printCharWithFreq(str); //the current algorithm does not work for caps or space
    }
}

//Find the frequency of a specific character
class FrequencyOfCharacter2 {

    private static int freqOfChar(String str, char charToFind)
    {
        int n = str.length();
        int counter=0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == charToFind) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String args[])
    {
        String str = "hello People";
        System.out.println(freqOfChar(str, 'p'));
        System.out.println(freqOfChar(str.toLowerCase(), 'p')); // to ignore case
    }
}

