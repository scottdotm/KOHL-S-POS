package discountstrategy;

/**
 *
 * @author smuth4
 */
public class ArrayPractice {
    public static void main(String[] args){
        String[] names = new String[0];
        String[] temp = new String[names.length + 1];
        for(int i=0; i < names.length; i++){
            temp[i] = names[i];
        }
        temp[temp.length -1] = "Hello";
        names = temp;
        temp = null;
    }
}
