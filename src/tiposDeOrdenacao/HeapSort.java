package tiposDeOrdenacao;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Constrói um heap máximo
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extrai elementos um por um do heap
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz (maior elemento) para o final do array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chama heapify no heap reduzido
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Verifica se o filho esquerdo é maior que a raiz
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Verifica se o filho direito é maior que a raiz
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Se o maior elemento não está na raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Chamada recursiva para heapify a sub-árvore afetada
            heapify(arr, n, largest);
        }
    }
}
