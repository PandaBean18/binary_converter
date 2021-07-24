import java.util.Arrays;
public class BinaryConverter {
    public static void main(String[] args) {
        int[] a = BinaryConverter.converter(1234);
        for(int i = 1; i <= a.length; i++) {
            System.out.println(a[a.length - i]);
        }
    }
    static int[] converter(int num) {
        if(num / 2 == 0) {
            int[] array = {1};
            return array;
        }
        int[] arr = new int[0];
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = num % 2;
        int[] arr1 = BinaryConverter.merge(arr, BinaryConverter.converter(num / 2));
        return arr1;
    }

    static int[] merge(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        for(int i = 0; i < (a.length + b.length); i++) {
            if(i < a.length) {
                arr[i] = a[i];
            } else {
                arr[i] = b[i - a.length];
            }
        }
        return arr;
    }
}
