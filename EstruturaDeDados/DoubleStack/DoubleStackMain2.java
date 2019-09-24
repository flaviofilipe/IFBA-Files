package DoubleStack;

public class DoubleStackMain2 {
	public static void main(String[] args) {
		DoubleStackable2 pilhas = new DoubleStack2();
		pilhas.push(1, "Claudio");
		pilhas.push(2, "Rodolfo");
		pilhas.push(2, "Sousa");
		pilhas.push(1, "de");
		pilhas.push(1, "Oliveira");
		System.out.println(pilhas.pop(2));
		System.out.println(pilhas.pop(1));
		System.out.println(pilhas.top(1));
		System.out.println(pilhas.top(2));
		System.out.println(pilhas.toString(1));
		System.out.println(pilhas.toString(2));
	}
}