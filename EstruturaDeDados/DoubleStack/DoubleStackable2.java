package DoubleStack;

public interface DoubleStackable2 {
	//o parametro de entrada chamado pilha 
	//indica em qual pilha (1 ou 2) acontecerá a operação específica
	void push(int pilha, Object o);
	Object pop(int pilha);
	Object top(int pilha);
	boolean isEmpty(int pilha);
	boolean isFull(int pilha);
	String toString(int pilha);
}