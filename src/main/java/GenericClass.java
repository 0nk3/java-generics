public class GenericClass<T> {
    private T element;
    // getter
    private T getElement(){
        return  element;
    }
    // add /setter
    private void setElement(T element){

        this.element = element;
    }

    public static void main(String... args) {
        // example case 1
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setElement("Test");
        System.out.println(stringInstance.getElement());

        // example case 2
        GenericClass<Integer> integerInstance =  new GenericClass<>();
        integerInstance.setElement(1000);
        System.out.println(integerInstance.getElement());

    }
}
