import java.util.Arrays;
public class Homework_4_2 {
    public static void main(String[] args) {
        // вхідний масив
        int[] array = {5, 10, 2, 8, 3};
        System.out.println("Initial array: " + Arrays.toString(array));

        // сортування від найменшого до найбільшого
        int[] sortedArrayAsc = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArrayAsc);
        System.out.println("Sorting from smallest to largest: " + Arrays.toString(sortedArrayAsc));

        // сортування від найбільшого до найменшого
        int[] sortedArrayDesc = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArrayDesc);
        for (int i = 0; i < sortedArrayDesc.length / 2; i++) {
            int temp = sortedArrayDesc[i];
            sortedArrayDesc[i] = sortedArrayDesc[sortedArrayDesc.length - 1 - i];
            sortedArrayDesc[sortedArrayDesc.length - 1 - i] = temp;
        }
        System.out.println("Sorting from largest to smallest: " + Arrays.toString(sortedArrayDesc));

        // сортування, де від країв найбільші, а в середині найменші
        int[] sortedArrayEnds = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArrayEnds);
        for (int i = 0; i < sortedArrayEnds.length / 2; i++) {
            int temp = sortedArrayEnds[i];
            sortedArrayEnds[i] = sortedArrayEnds[sortedArrayEnds.length - 1 - i];
            sortedArrayEnds[sortedArrayEnds.length - 1 - i] = temp;
        }
        int[] sortedArrayCenter = new int[sortedArrayEnds.length];
        int left = 0;
        int right = sortedArrayEnds.length - 1;
        for (int i = 0; i < sortedArrayCenter.length; i++) { // заповнюємо масив згідно умови
            if ((sortedArrayCenter.length - i) % 2 == 0) {
                sortedArrayCenter[i] = sortedArrayEnds[right];
                right--;
            } else {
                sortedArrayCenter[i] = sortedArrayEnds[left];
                left++;
            }
        }
        System.out.println("Sorting from the edges is the largest, in the middle is the smallest: " + Arrays.toString(sortedArrayCenter));
    }
}
