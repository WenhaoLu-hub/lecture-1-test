public class CustomArray {

    private String[] array; // has a relationship
    private int numberOfElements; // has numberOfElement

    public CustomArray(){
        array = new String[2];
    }

    public void add(String item){
        if(numberOfElements == array.length){
            String[] temp = new String[array.length * 2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
        array[numberOfElements] = item;
        numberOfElements++;
    }

    public int size(){
        return numberOfElements;
    }
    
}
