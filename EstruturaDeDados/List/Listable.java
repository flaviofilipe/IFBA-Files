public interface Listable{
    void insert(int posicao, Object dado);
    void append(Object dado);
    Object delete(int posicao);
    Object select(int posicao);
    void update(int posicao, Object novoDado);
    boolean isEmpty();
    boolean isFull();
    String toString();
}