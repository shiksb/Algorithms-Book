public class Tester {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(28);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}