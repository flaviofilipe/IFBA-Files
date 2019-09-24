public class CircularList implements Listable {

    private int quantidade;
    private int inicio, fim;
    private Object[] dados;

    public CircularList() {
        this(10);
    }

    public CircularList(int tamanho) {
        quantidade = 0;
        inicio = 0;
        fim = -1;
        dados = new Object[tamanho];
    }

    @Override
    public void insert(int posicao, Object dado) {

    }

    @Override
    public void append(Object dado) {
        if (!isFull()) {
            if (fim == dados.length - 1) {
                fim = -1;
            }
            quantidade++;
            fim++;
            dados[fim] = dado;
        } else {
            System.out.println("Full Queue");
        }
    }

    @Override
    public Object delete(int posicao) {
        return null;
    }

    @Override
    public Object select(int posicao) {
        Object temp = null;
        if (!isFull()) {
            if (posicao >= 0 && posicao < quantidade) {
                temp = dados[(inicio + posicao) % dados.length];
            }
        }
        return temp;
    }

    @Override
    public void update(int posicao, Object novoDado) {
        if (!isFull()) {
            if (posicao >= 0 && posicao < quantidade) {
                dados[(inicio + posicao) % dados.length] = novoDado;
            }
        }
    }

    @Override
    public boolean isFull() {
        return (quantidade == dados.length);
    }

    @Override
    public boolean isEmpty() {
        return (quantidade == 0);

    }

    public String toString() {
        String temp = "[";
        int i = inicio;
        for (int auxQtde = 0; auxQtde != quantidade; auxQtde++) {
            // patch para que a fila funcione de forma circular
            if (i == dados.length) {
                i = 0;
            }
            // fim do patch
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
