public class BubblesortExample {

    // Método para ordenar el array utilizando el algoritmo de bubble sort
    public static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            // Seguir si hubo algún intercambio en esta iteración
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparar elementos adyacentes y cambiar si están en el orden incorrecto
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambio, la lista ya está ordenada
            if (!swapped) {
                break;
            }
        }
    }

    // Método para imprimir los elementos del array
    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Método principal para demostrar la ordenación de tres listas diferentes
    public static void main(String[] args) {
        // Lista 1
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Lista 1 sin ordenar:");
        printArray(numbers1);
        bubbleSort(numbers1);
        System.out.println("Lista 1 ordenada:");
        printArray(numbers1);

        // Lista 2
        int[] numbers2 = {5, 1, 4, 2, 8};
        System.out.println("Lista 2 sin ordenar:");
        printArray(numbers2);
        bubbleSort(numbers2);
        System.out.println("Lista 2 ordenada:");
        printArray(numbers2);

        // Lista 3
        int[] numbers3 = {3, 0, -1, 8, 7, 2, 5};
        System.out.println("Lista 3 sin ordenar:");
        printArray(numbers3);
        bubbleSort(numbers3);
        System.out.println("Lista 3 ordenada:");
        printArray(numbers3);
    }
}
