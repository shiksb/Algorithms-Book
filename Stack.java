public class Stack {

	private int[] array;
	private int size; 

	public Stack() {
		this.array = new int[1];
		this.size = 0;
	}

	public void push(int x) {
		if(size == array.length) {
			int[] newArray = new int[array.length * 2];
			for(int i = 0; i < array.length; i++){
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[size] = x;
		size++;
	}

	public int pop() {
		if(size > 0) {
			size--;
			return array[size];
		} else {
			return 0;
		}
	}

	public int top() {
		if(size > 0) {
			return array[size - 1];
		} else {
			return 420;
		}
	}
}