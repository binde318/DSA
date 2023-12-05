public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort is pairs of adjacent elements are compared,
        // and elements are swapped if they are not in order
        //Quadratic time 0(n^2)
        //small data set - its okay
        //large data set - bad

        int [] array = {9,1,5,7,3,5,8,4,2};
        bubbleSort(array);
        for (int i : array){
            System.out.print(i);
        }
    }
    public static void bubbleSort(int [] array){
        for (int i =0; i<array.length - 1; i++){
            for (int j =0; j<array.length - i - 1; j++){
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                }

            }
        }

    }
}
