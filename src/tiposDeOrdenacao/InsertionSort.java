package tiposDeOrdenacao;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
	    int n = arr.length;
	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;

	        // Move os elementos do array que são maiores que a chave para uma posição à frente de sua posição atual
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}
}