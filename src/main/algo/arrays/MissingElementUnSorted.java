public class MissingElementUnSorted {
    public int missingElement(int[] a) {
        int n = a.length + 1;
        int missing = 0;
        for (int i = 0; i < a.length; i++) {
            missing = missing + n - a[i];
            n--;
        }
        missing = missing + n;
        return missing;
    }

    public static void main(String[] args) {
        MissingElementUnSorted missingElementUnSorted = new MissingElementUnSorted();
        System.out.println(missingElementUnSorted.missingElement(new int[]{11,2,4,5,3,7,8,9,10,1}));
    }
}