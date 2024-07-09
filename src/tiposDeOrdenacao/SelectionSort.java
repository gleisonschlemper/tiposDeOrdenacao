package tiposDeOrdenacao;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            // Encontra o índice do menor elemento no restante do array
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o menor elemento encontrado com o elemento na posição i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}