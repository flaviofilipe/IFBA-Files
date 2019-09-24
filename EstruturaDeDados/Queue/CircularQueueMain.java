package Queue;
public class CircularQueueMain {
	public static void main(String[] args) {
		Queueable filaCircular = new CircularQueue(4);
		filaCircular.enqueue("Claudio");
		filaCircular.enqueue("Rodolfo");
		System.out.println(filaCircular.peek());
		System.out.println(filaCircular.peek());
		System.out.println(filaCircular.peek());
		filaCircular.enqueue("Sousa");
		filaCircular.dequeue();
		filaCircular.enqueue("de");
		filaCircular.enqueue("Oliveira");
		System.out.println("SecondName:" + filaCircular.dequeue());
		System.out.println(filaCircular);
		System.out.println("Teste");
	}
}