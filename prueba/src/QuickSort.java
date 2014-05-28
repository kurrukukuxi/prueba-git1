public class QuickSort {

	public static <T> void ordenaQuickSort(Comparable<T> [] array){	
		ordenaQuickSort(array,0,array.length-1);
	}
	
	public static <T> void ordenaQuickSort(Comparable<T> [] array, int inicio, int fin){
		int pivote= Math.round((inicio+fin)/2);
		
	    T valor_pivote = (T) array[pivote];
		int i=inicio;
		int j=fin;
		while (i<j){
			while(array[i].compareTo(valor_pivote)<0)
				i++;
			while(array[j].compareTo(valor_pivote)>0)
				j--;
			if(i<=j){
				intercambia(array,i,j);
				i++;
				j--;
			}
		}
		if (inicio < j)
			ordenaQuickSort(array, inicio, j);
		if (i < fin)
			ordenaQuickSort(array, i, fin);
	}
	
	public static <T> void intercambia(Comparable<T> [] array, int i, int j){
		T temp = (T) array[i];
		array[i] = array[j];
		array[j] = (Comparable<T>) temp;
	}
}