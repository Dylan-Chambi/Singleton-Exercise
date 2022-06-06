package chainofresponsability.exercise;

import java.util.Comparator;

public class BubbleSort {
    public static<T> void bubbleSort(T[] elems, int n, Comparator<T> comp){
        int i,j,k,l;
        boolean anySwaps=true;
        for(i=0,k=n-1;i<k && anySwaps;i++){
            anySwaps=false;
            for(j=n-1,l=i+1;j>=l;j--){
                if(comp.compare(elems[j], elems[j-1])<0){
                    swap(elems, j, j-1);
                    anySwaps=true;
                }
            }
        }
    }
    private static<T> void swap(T[]elems, int i,int j){
        T temp=elems[j];
        elems[j]=elems[i];
        elems[i]=temp;
    }
}
