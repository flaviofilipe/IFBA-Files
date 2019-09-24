package Queue;
public class CircularQueue implements Queueable {
	
	private int quantidade;
	private int inicio, fim;
	private Object[] dados;
	
	public CircularQueue() {
		this(10);
	}
	
	public CircularQueue(int tamanho) {
		quantidade = 0;
		inicio = 0;
		fim = -1;
		dados = new Object[tamanho];
	}
	
	public void enqueue(Object dado) {
		if (!isFull()) {
			//patch para que a fila funcione de forma circular
			if (fim == dados.length - 1) {
				fim = -1;
			}
			quantidade++;
			//fim do patch
			fim++;
			dados[fim] = dado;
		} else {
			System.err.println("Full Queue!");
		}				
	}
	
	public Object dequeue() {
		Object temp = null;	
		if (!isEmpty()) {
			temp = dados[inicio];
			inicio++;
			//patch para que a fila funcione de forma circular
			quantidade--;
			if (inicio == dados.length) {
				inicio = 0;
			}
			//fim do patch
		} else {
			System.err.println("Queue is empty!");
		}
		return temp;			
	}
	
	public Object peek() {
		Object temp = null;
		if (!isEmpty()) {
			temp = dados[inicio];
		} else {
			System.err.println("Queue is empty!");		
		}
		return temp;
	}
		
	public boolean isFull() {
		return (quantidade == dados.length);
	}

	public boolean isEmpty(){
		return (quantidade == 0);
		
	}

	public String toString() {
		String temp = "[";
		int i = inicio;
		for (int auxQtde = 0; auxQtde != quantidade; auxQtde++) {
			//patch para que a fila funcione de forma circular
			if (i == dados.length) {
				i = 0;
			}
			//fim do patch	
			if (i == fim) {
				temp += dados[i];
			} else {
				temp += dados[i] + ",";
			}
			i++;
		}
		return temp + "]";	

		}
}
