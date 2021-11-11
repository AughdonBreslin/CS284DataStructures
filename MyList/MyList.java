package basics;

public class MyList<E> {
	// data fields
	private E[] data;
	private int free;
	
	
	// Constructors
	MyList(int size) {
		data = (E[]) new Object[size];
		free = 0;
	}
	
	// Methods
	/**
	 * Add element elem at the end of the list.
	 * Returns null if the list is full
	 * @param elem Element to insert
	 * @return The element just inserted
	 */
	public E addLast(E elem) {
		if (free==data.length) { // array is full
			throw new IllegalStateException();
		}
		data[free]=elem;
		free++;
		return elem;
	}
	
	public E addFirst(E elem) {
		return add(0,elem);
	}
	
	public E add(int index, E elem) {
		if (index<0 || index>free) { // index out of range
			throw new IllegalArgumentException();
		}
		if (free==data.length) { // array is full
			throw new IllegalStateException();
		}		
		for (int i=free; i>index; i--) {
			data[i]=data[i-1];
		}
		data[index]=elem;
		free++;
		return elem;
	}
	
	public E removeLast() {
		return null;
	}
	
	public E removeFirst() {
		return null;
	}
	
	public E remove(int index) {
		return null;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i=0; i<free; i++) {
			s.append(data[i].toString()+",");
		}
		return "["+s.toString()+"]";
	}
	
	
	public static void main(String[] args) {
		MyList<Integer> l = new MyList<>(20);
		
		for (int i=0; i<10; i++) {
			l.addFirst(i);
		}
		System.out.println(l);
		
		l.add(4, 12);
		System.out.println(l);
		
		MyList<String> l2 = new MyList<String>(20);
		
	}
	
}
