public class MergeSortExample {

    // Method to sort the array using the merge sort algorithm
    public static void mergeSort(int[] data) {
        if (data.length > 1) {
            int mid = data.length / 2;

            // Divide the array into two halves
            int[] left = new int[mid];
            int[] right = new int[data.length - mid];

            System.arraycopy(data, 0, left, 0, mid);
            System.arraycopy(data, mid, right, 0, data.length - mid);

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(data, left, right);
        }
    }

    // Method to merge two sorted arrays into one
    public static void merge(int[] data, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the arrays as long as there are elements in both
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                data[k++] = left[i++];
            } else {
                data[k++] = right[j++];
            }
        }

        // Copy the remaining elements from left
        while (i < left.length) {
            data[k++] = left[i++];
        }

        // Copy the remaining elements from right
        while (j < right.length) {
            data[k++] = right[j++];
        }
    }

    // Method to print the elements of the array using for-each
    public static void printArray(int[] data) {
        for (int element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main method to demonstrate sorting of three different lists
    public static void main(String[] args) {
        // List 1
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("List 1 unsorted:");
        printArray(numbers1);
        mergeSort(numbers1);
        System.out.println("List 1 sorted:");
        printArray(numbers1);

        // List 2
        int[] numbers2 = {5, 1, 4, 2, 8};
        System.out.println("List 2 unsorted:");
        printArray(numbers2);
        mergeSort(numbers2);
        System.out.println("List 2 sorted:");
        printArray(numbers2);

        // List 3
        int[] numbers3 = {3, 0, -1, 8, 7, 2, 5};
        System.out.println("List 3 unsorted:");
        printArray(numbers3);
        mergeSort(numbers3);
        System.out.println("List 3 sorted:");
        printArray(numbers3);
    }
}
