import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] array = { 28, 13, 51, 61, 1, 16 };
        ss.selectionsort(array);
        System.out.println("Sorted Array:\t" + Arrays.toString(array));
    }
}
