
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] newarr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }
        for (int j = arr1.length; j < newarr.length; j++) {
            newarr[j] = arr2[j-arr1.length];
        }
        return newarr;
    }
}
