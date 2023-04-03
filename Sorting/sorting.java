package Sorting;

import java.util.Arrays;

public class sorting {


	private static <E> void swap(E[] table, int i, int j) {
		E temp =  table[i];
		table[i]=table[j];
		table[j]=temp;
	}
	
	public static <E extends Comparable<E>> void s_sort(E[] table) {
		// Exercise: complete implementation!
		
		for (int fill=0; fill<table.length-2; fill++) {
			
			int posMin=fill;
			// look for minimum element in subarray [fill,n-1]
			swap(table,fill,posMin);
		}
	}

	
	public static <E extends Comparable<E>> void b_sort(E[] table) {
		
		Boolean swap;
		int endpoint = table.length-1;
		
		do {
			swap=false;
			for (int i=0; i<endpoint; i++) {
				int c = table[i].compareTo(table[i+1]);
			    if (c>0) {
			    	swap(table,i,i+1);
			    	swap=true;
			    }
			}
			endpoint--;
			
		} while (swap);
	}
	
	public static void main(String[] args) {
		Integer[] a = { 7,6,5,4,3,2,1};
		
		b_sort(a);
		
		System.out.println(Arrays.toString(a));
		
	}
}

