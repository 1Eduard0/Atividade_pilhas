public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    @SuppressWarnings("unchecked")
    public StaticStack(int size) {
        data = (T[]) new Object[size]; 
    }

    public void push(T value) {
        if (isFull()) {
            throw new IllegalArgumentException("A Pilha está cheia e o valor: " + value + " não foi adicionado");
        } else {
            data[++top] = value; 
            System.out.println("Adicionado: " + value);
            printStack();
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("A Pilha está vazia");
            return null;
        } else {
            T value = data[top];   
            data[top--] = null;    
            System.out.println("Removido: " + value);
            printStack();
            return value;
        }
    }

    public void clear() {
        top = -1; 
    }

    public boolean isFull() {
        return top == data.length - 1; 
    }

    public boolean isEmpty() {
        return top == -1; 
    }

    public void printStack() {
        System.out.print("Pilha atual: ");
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i <= top; i++) {
                System.out.print(data[i]);
                if (i < top) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}

