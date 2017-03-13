public class Queue {

	private int[] array;
	private int size;
	private int enq;
	private int deq;

	public Queue() {
		array = new int[10];
		size = 0;
		enq = 0;
		deq = 0;
	}

	public void enqueue(int x){
		if(size == array.length) { throw new ArrayIndexOutOfBoundsException(); }
		array[enq] = x;
		enq++;
		enq = (enq == array.length) ? 0 : enq;
		size++;
	}

	public int dequeue() {
		if(size == 0) { return 0; }
		int temp = array[deq];
		deq++;
		deq = (deq == array.length) ? 0 : deq;
		size--;
		return temp;
	}

}