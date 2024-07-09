package tiposDeOrdenacao;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            // Se nenhum elemento foi trocado nesta iteração, o array já está ordenado
            if (!swapped) {
                break;
            }
        }
    }
}