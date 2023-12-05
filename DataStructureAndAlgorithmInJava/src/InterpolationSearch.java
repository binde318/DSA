public class InterpolationSearch {
    public static void main(String[] args) {


        //This is the improvement of binary search, used for uniformly distributed data
        //"guess" where a value might be based calculated probe results if probe is incorrect, search area
        // is narrowed and a probe is calculated.

        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};
        int index = interpolationSearch(array, 256);
        if (index != -1){
            System.out.println("Element found at : " + index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length-1;
        int low =0;
        while (value >= array[low] && value <= array[high] && low <= high){
            int probe = low + (high - low) * (value - array[low])/(array[high] - array[low]);
            System.out.println("Probe :" + probe);
            //check if a probe is correct
            if (array[probe] == value){
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            }else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
