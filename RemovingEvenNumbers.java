import java.util.Arrays;

public class RemovingEvenNumbers {

    public void removingEvenNumber(int [] array){
        int oddsize = 0; int j;
        for ( j=0;j< array.length;j++) {
            if (array[j]%2 ==1) {
                oddsize++;
            }
        }
        int [] updatedArray=new int [oddsize];
        int updatedArrayIndex=0;
        for( j=0;j< array.length;j++){
            if(array[j]%2 ==1){
                updatedArray[updatedArrayIndex]=array[j];
                updatedArrayIndex++;
            }
        }

        System.out.println(("Array with no even numbers is " + " "+ Arrays.toString(updatedArray)));
    }


    public static void main(String[] args) {
        RemovingEvenNumbers ren =new RemovingEvenNumbers();
        ren.removingEvenNumber(new int[] {3,2,6,7,9,8,3,4,5});

    }
}