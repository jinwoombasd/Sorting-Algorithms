public class ArrayMethods {
 
    public static long[] merge(long[] array1, long[] array2) {
        long length1 = array1.length;
        long length2 = array2.length;
        long[] destArray = new long[(int) (length1 + length2)];
        int i = 0, l = 0, m = 0;

        while (i < length1 && l < length2) {
            if (array1[i] <= array2[l]) {
                destArray[m++] = array1[i++];
            } else {
                destArray[m++] = array2[l++];
            }
        }

        while (i < length1) {
            destArray[m++] = array1[i++];
        }

        while (l < length2) {
            destArray[m++] = array2[l++];
        }

        return destArray;
    }
}
