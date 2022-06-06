package chainofresponsability.exercise;


import java.util.Comparator;

public class QuickSort{
    public static<T>void initialQuickSort(T elems[], int n, Comparator<T> comp){
        quickSort(elems,0,n-1,comp);
    }

    private static<T>void quickSort(T elems[],int i,int j,Comparator<T> comp){
        int k,posPivote;
        T pivote;
        posPivote=findPivot(elems,i,j, comp);
        if (posPivote>=0){
            pivote=elems[posPivote];
            k=particion(elems,i,j,pivote, comp);
            quickSort(elems,i,k-1, comp);
            quickSort(elems,k,j,comp);
        }
    }

    private static<T>int findPivot(T elems[],int i,int j,Comparator<T> comp){
        T firstElement;
        int k,pivote=-1;

        firstElement=elems[i];
        for(k=i+1;k<=j;k++){
            if (comp.compare(elems[k], firstElement)>0)
                return k;
            if (comp.compare(elems[k],firstElement)<0)
                return i;
        }
        return pivote;
    }

    private static<T>int particion(T elems[], int i, int j, T pivot,Comparator<T> comp) {
        int left, right;
        left = i;
        right = j;
        do {
            swap(elems, left, right);
            while (comp.compare(elems[left], pivot) < 0) {
                left++;
            }
            while (comp.compare(elems[right],pivot)>=0) {
                right--;
            }
        } while (left < right);
        return left;
    }
    public static<T> void swap(T[]elems, int i,int j){
        T temp=elems[j];
        elems[j]=elems[i];
        elems[i]=temp;
    }
}

