public class MultiDimArrays {

    public static void main(String[] args) {
        String[][] name = {{"Riyadh", "Riad", "Riyad"}, {"Sharif", "Sherif", "Shorif"}};
        printMultiDimArray(name);
        printMultiDimArrayAnotherMethod(name);
    }

    public static void printMultiDimArray (String[][] name){

        System.out.println("---Print with for loop---");

        for (int i = 0; i<name.length; i++){
            for (int j = 0; j<name[i].length; j++){
                System.out.println("Names: " + name[i][j]);
            }
        }

    }

    public static void printMultiDimArrayAnotherMethod (String[][] name){

        System.out.println("---Print with for each loop---");

        for (String[] x : name){
            for (String y: x){
                System.out.println("Names: " + y);
            }
        }

    }

}
