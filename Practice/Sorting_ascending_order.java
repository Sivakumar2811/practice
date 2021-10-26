package Practice;

public class Sorting_ascending_order {
    public static void main(String[] args) {
        int a[] = {2, 5, 9, 66, 4, 0, -100, 19, 24, 58, 66, 34, 89};

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int change = a[i];
                    a[i] = a[j];
                    a[j] = change;
                }
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
