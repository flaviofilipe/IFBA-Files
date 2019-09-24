package Queue;
public class Queue implements Queueable {

	private int inicio, fim;
	private Object[] dados;
	
	public Queue() {
		this(10);
	}
	
	public Queue(int tamanho) {
		inicio = 0;
		fim = -1;
		dados = new Object[tamanho];
	}
	
	public void enqueue(Object dado){
		if (!isFull()) {
			fim++;
			dados[fim] = dado;
		} else {
			System.err.println("Full Queue!");
		}
	}
	
	public Object dequeue(){
		Object temp = null;	
		if (!isEmpty()) {
			temp = dados[inicio];
			inicio++;
		} else {
			System.err.println("Queue is empty!");
		}
		return temp;		
	}
	
	public Object peek(){
		Object temp = null;
		if (!isEmpty()) {
			temp = dados[inicio];
		} else {
			System.err.println("Queue is empty!");		
		}
		return temp;
	}
	
	public boolean isFull(){
		return (fim == dados.length - 1);
	}
	
	public boolean isEmpty(){
		return (inicio > fim);
	}
	
	public String toString(){
		String temp = "[";
		for (int i = inicio; i <= fim; i++) {
			if (i == fim)
				temp += dados[i];
			else 
				temp += dados[i] + ",";
		}
		return temp + "]";		
	}
}