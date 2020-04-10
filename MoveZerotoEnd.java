import java.util.Arrays;
import java.util.LinkedList;


public class MoveZerotoEnd {
    
    public static void main(String args[]){
        int[] intArray = new int[]{ 1,2,3,4,0, 5,6,7,0, 8,9,10 };  
        int[] outArray = moveZero(intArray);
        System.out.println(Arrays.toString(outArray));
        
    }

    private static int[] moveZero(int[] intArray) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        int arrayLength = intArray.length;
        int count = 0;
        
        for(int i=0; i<arrayLength; i++){
           if(intArray[i] != 0){
               list.add(intArray[i]);
               count++;
           }
        }
        for(int j=0; j<arrayLength; j++){  
            if(j < count){
                intArray[j] = list.get(j);
            }
            else {
                intArray[j] = 0;
            }
        }
        return intArray;

    }
    

}
