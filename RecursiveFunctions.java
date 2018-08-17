import java.util.*;

public class RecursiveFunctions {

    /*
           input: n:	0	1	2	3	4	5	6	7	8	9	10	11...
result: nth Fibonacci:	0	1	1	2	3	5	8	13	21	34	55	89...
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibSeriesCreatorWithRegularforLoop(0, 11)));
        System.out.println(fibSeriesCreatorWithHashMap(0, 11));
        System.out.println(fibSeriesCreatorWithArrayList(0, 11));
    }


    //Fibonacci series creator with HashMap
    public static HashMap fibSeriesCreatorWithHashMap (Integer x, Integer y){
        HashMap<Integer, Integer> fibHashMap = new HashMap<Integer, Integer>(1+(y-x));

        for (int i=x; i<=y; i++){
            fibHashMap.put(i, fib(i));
        }

        return fibHashMap;
    }

    //Fibonacci series creator with ArrayList
    public static ArrayList fibSeriesCreatorWithArrayList (Integer x, Integer y){
        ArrayList<Integer> fibArrayList = new ArrayList<Integer>(1+(y-x));

        //ListIterator<Integer> arrayListIterator = fibArrayList.listIterator();

        for (int i=x; i<=y; i++){
            //arrayListIterator.add(fib(i));
            fibArrayList.add(fib(i));
        }

        return fibArrayList;
    }


    //Fibonacci series creator with regular for loop
    public static int[] fibSeriesCreatorWithRegularforLoop (int x, int y){

        int seriesSize = 1 + (y - x);

        int[] fibSeries = new int[seriesSize];
        System.out.println("Size: " + fibSeries.length);
        for (int i = x, j = 0; i<=y;  i++, j++){
            fibSeries[j] = fib(i);
        }
        return fibSeries;
    }

    public static int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
