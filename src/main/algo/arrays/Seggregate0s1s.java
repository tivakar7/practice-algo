public class Seggregate0s1s {
    public void arrange01s(int[] a) {
        int s = 0, e = a.length - 1;
        while (s < e) {
            while (a[s] == 0 && s < e)
                s++;
            while (a[e] == 1 && s < e)
                e--;
            swap(a, s, e);
            s++;
            e--;
        }
    }

    public void swap(int[] a, int s, int e) {
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }

    public static void main(String[] args) {
        Seggregate0s1s Seggregate0s = new Seggregate0s1s();
        int[] a = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        Seggregate0s.arrange01s(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{0, 0, 0};
        Seggregate0s.arrange01s(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{1, 1, 1};
        Seggregate0s.arrange01s(a);
        System.out.println(Arrays.toString(a));
    }
}