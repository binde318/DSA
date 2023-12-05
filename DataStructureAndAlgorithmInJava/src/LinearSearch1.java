public class LinearSearch1 {
    public static void main(String[] args) {
        //linear search iterate through a collection one element at a time to locate a targeted element.
        //linear search no need to be sorted

        int [] array = {9,11,6,2,5,7,1,3};
        int index = linearSearch(array,1);

        if (index!=-1){
            System.out.println("Element found at :" + index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i =0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
