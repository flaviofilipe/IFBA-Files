package Queue;

public class QueueMain {
	public static void main(String[] args) {
		Queueable fila = new Queue();
		fila.enqueue("Claudio");
		fila.enqueue("Rodolfo");
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		fila.enqueue("Sousa");
		fila.dequeue();
		fila.enqueue("de");
		fila.enqueue("Oliveira");
		System.out.println("SecondName:" + fila.dequeue());
		System.out.println(fila);
		System.out.println("Teste2");

	}
}