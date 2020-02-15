public class GenericMethod {
    public static void main(String[] args) {
        // declare and initialise arrays to be passed
        Integer[] intArray = { 12, 324, 6, 7900 };
        String[] strArray = { "12", "324", "6", "ttt" };

        new Object(){
            private <T> void printArrayContent(T[] input){
                for (T t: input) {
                    System.out.println(t);
                }
            }
        }.printArrayContent(strArray); // <--- change argument to any array of any type

    }


}
