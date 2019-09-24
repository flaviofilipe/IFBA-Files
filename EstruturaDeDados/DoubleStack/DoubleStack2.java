package DoubleStack;

public class DoubleStack2 implements DoubleStackable2 {

    private Object[] dados;
    private int topo1;
    private int topo2;

    public DoubleStack2() {
        this(10);
    }

    public DoubleStack2(int tamanho) {
        dados = new Object[tamanho];
        topo1 = -1;
        topo2 = tamanho;
    }

    // esse único método engloba o código de push1 e push2
    // da abordagem anterior
    public void push(int pilha, Object o) {
        switch (pilha) {
        case 1:
            if (!isFull(1)) {
                topo1++;
                dados[topo1] = o;
            } else {
                System.out.println("Pilha 1 Cheia");
            }
            break;
        case 2:
            if (!isFull(2)) {
                topo2--;
                dados[topo2] = o;
            } else {
                System.err.println("Pilha 2 Cheia");
            }
            break;
        default:
            System.out.println("Pilha Inexistente!");
        }
    }

    // esse único método engloba o código de pop1 e pop2
    // da abordagem anterior
    public Object pop(int pilha) {
        Object temp = null;
        switch (pilha) {
        case 1:
            if (!isEmpty(1)) {
                temp = dados[topo1];
                topo1--;
            } else {
                System.out.println("Pilha 1 Vazia");
            }
            break;
        case 2:
            if (!isEmpty(2)) {
                temp = dados[topo2];
                topo2++;
            } else {
                System.err.println("Pilha 2 Vazia");
            }
            break;
        default:
            System.out.println("Pilha Inexistente!");

        }
        return temp;
    }

    // esse único método engloba o código de top1 e top2
    // da abordagem anterior
    public Object top(int pilha) {
        Object temp = null;
        switch (pilha) {
        case 1:
            if (!isEmpty(1)) {
                temp = dados[topo1];
            } else {
                System.out.println("Pilha 1 Vazia");
            }
            break;
        case 2:
            if (!isEmpty(2)) {
                temp = dados[topo2];
            } else {
                System.err.println("Pilha 2 Vazia");
            }
            break;
        default:
            System.out.println("Pilha Inexistente!");

        }
        return temp;
    }

    // esse único método engloba o código de isEmpty1 e isEmpty2
    // da abordagem anterior
    public boolean isEmpty(int pilha) {

        switch (pilha) {
        case 1:
            return (topo1 == -1);
        case 2:
            return (topo2 == dados.length);
        default:
            System.out.println("Pilha Inexistente!");
            return false;
        }
    }

    // esse único método engloba o código de isFull1 e isFull2
    // da abordagem anterior
    public boolean isFull(int pilha) {
        switch (pilha) {
        case 1:
        case 2:
            return (topo2 == topo1 - 1);
        default:
            System.out.println("Pilha Inexistente!");
            return false;
        }
    }

    // esse único método engloba o código de toString1 e toString2
    // da abordagem anterior
    public String toString(int pilha) {
        String mostrar = "[";
        switch (pilha) {
        case 1:
            for (int i = 0; i <= topo1; i++) {
                if (i == topo1)
                    mostrar += dados[i];
                else
                    mostrar += dados[i] + ",";
            }
            mostrar += "]";
            break;
        case 2:
            for (int i = dados.length - 1; i >= topo2; i--) {
                if (i == topo2) {
                    mostrar += dados[i];
                } else {
                    mostrar += dados[i] + ",";
                }
            }
            mostrar += "]";
            break;
        default:
            System.out.println("Pilha Inexistente!");

        }
        return mostrar;
    }
}