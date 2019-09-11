public class ArrPlusArr {
    public int[] addArr(int[] a,int[] b) {
        int tempLength = a.length + b.length;
        int[] temp = new int[tempLength];
        for (int i = 0; i < tempLength; i++) {
            if (i < a.length) temp[i] = a[i];
            else temp[i] = b[i - a.length];
        }
        return temp;
    }
}





