package chainofresponsability.exercise;

import java.util.Comparator;

public class SortArray {
    public static<T> void sort(SortAlgorithm algorithm, T[]elems, Comparator<T> comparator){
        int n = elems.length;
        switch(algorithm){
            case BUBBLE_SORT:
                BubbleSort.bubbleSort(elems, n, comparator);
                break;
            case INSERT_SORT:
                InsertionSort.insertionSort(elems, n, comparator);
                break;
            case QUICK_SORT:
                QuickSort.initialQuickSort(elems, n, comparator);
                break;
            default:
                throw new IllegalArgumentException("Invalid sort algorithm");
        }
    }
}
