package tiposDeOrdenacao;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		HeapSort heapSort = new HeapSort();
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selecionSort = new SelectionSort();
		MergeSort mergeSort = new MergeSort(); 
		QuickSort quickSort = new QuickSort();
		
		int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i % 100; // Preenche o array com valores repetidos de 0 a 99
        }
        
        System.out.println("Array de entrada criado com elementos.");
        
        long startTime = System.currentTimeMillis();
        heapSort.heapSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Heap sort: " + (endTime - startTime) + " ms");
	
        /*
        long startTime = System.currentTimeMillis();
        bubbleSort.bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do bubble sort: " + (endTime - startTime) + " ms");
        
        startTime = System.currentTimeMillis();
        heapSort.heapSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Heap sort: " + (endTime - startTime) + " ms");
	
        startTime = System.currentTimeMillis();
        insertionSort.insertionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Insertion sort: " + (endTime - startTime) + " ms");
	
        startTime = System.currentTimeMillis();
        selecionSort.selectionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Selection sort: " + (endTime - startTime) + " ms");  
	
	
        
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(arr, 0, arr.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Merge sort: " + (endTime - startTime) + " ms");
	
	
        startTime = System.currentTimeMillis();
        quickSort.quickSort(arr, 0, arr.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Quick sort: " + (endTime - startTime) + " ms");
		*/
	}
	
}
