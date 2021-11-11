package heaps;

import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
	// data fields
	private ArrayList<E> data;
	
	// Constructor
	Heap(int length) {
		data = new ArrayList<E>(length);
	}
	
	// Methods
	
	private void swap(int parent,int child) {
		E temp = data.get(parent);
		data.set(parent,data.get(child));
		data.set(child, temp);
	}
	
	public E add(E item) {
		int last = data.size();
		data.add(item);
		int parent = (last-1)/2;
		int child = last;
		
		while (parent>=0 && data.get(child).compareTo(data.get(parent))<0) {
			swap(parent,child);
			child = parent;
			parent=(parent-1)/2;
		}
		return item;
	}
	
	public String toString() {
		return data.toString();
	}
	
	public static void main(String[] args) {
		Heap<Integer> h = new Heap<>(100);
		int[] a = { 12,24,8,33,9};
		
		for (Integer i:a) {
			h.add(i);
		}
		
		System.out.println(h);
	}
}
