package Queue;
//Caracteristicas de algo que deseja ter a qualidade de 
//ser enfileirável
public interface Queueable {
	//enfileirar
	void enqueue(Object dado);
	//desenfileirar
	Object dequeue();
	//espiar
	Object peek();
	//estaCheio
	boolean isFull();
	//estaVazio
	boolean isEmpty();
	//paraTexto
	String toString();
}