public class SampleLinearSearch {
    public static void main(String[] args) {
        int[] array ={8,9,3,6,4,1,3,2};
        int index = linearSearch1(array,1);
        if (index!=-1){
            System.out.println("Element fount at :" + index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch1(int[]array, int value) {
        for (int i = 0; i <array.length; i++){
            if (array[i]==value){
               return i;
            }
        }
        return -1;
    }
}
