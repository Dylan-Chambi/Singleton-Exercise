package chainofresponsability.exercise;

import java.util.Comparator;

public class InsertionSort {
    public static<T> void insertionSort(T elems[], int n, Comparator<T> comp){
        int i,j;
        for(i=1;i<n;i++){
            j=i;
            while(j>0 && (comp.compare(elems[j], elems[j-1])<0)){
                swap(elems, j, j-1);
                j--;
            }
        }
    }
    private static<T> void swap(T[]elems, int i,int j){
        T temp=elems[j];
        elems[j]=elems[i];
        elems[i]=temp;
    }
}
