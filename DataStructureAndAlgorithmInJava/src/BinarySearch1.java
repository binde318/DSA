import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {

        //Binary search: is a search algorithm that locates the positions a of target value in an array.
        //half of the array is deleted during each step.

        int [] array = new int[1000000];
        //int [] array = {2,4,6,7,8,9,11,67,90,34};
        int target = 777777;
        for (int i = 0; i < array.length; i ++){
            array[i]=i;
        }
        //int index = Arrays.binarySearch(array,target);
        int index =binarySearch(array,target);
        //int index = binarySearch(array,target);
        if (index == -1){
            System.out.println(target + " not found ");
        }else {
            System.out.println("Element found at :" + index);
        }
    }
    private static int binarySearch(int [] array, int target){
        int low = 0; //beginning of the array
        int high = array.length-1; //the end of the array
        while (low <= high){
            int middle = low + (high-low)/2;
            int value = array[middle];
            System.out.println(" middle :" + value);

            if (value < target) low =middle + 1;
            else if (value > target) high = middle + 1;
            else return middle;//means target found
        }
        return -1;//means target not found

    }
}
