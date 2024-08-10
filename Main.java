public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5); 

        try {
            stack.push(0);  
            stack.push(2);  
            stack.push(4);  

            stack.pop();       

            stack.push(6);  
            stack.push(8); 
            stack.push(10); 
            stack.push(33);

        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

            System.out.println("Pilha está cheia? " + stack.isFull()); 
            System.out.println("Pilha está vazia? " + stack.isEmpty()); 

            System.out.println("------------------------------------------------------------------------"); 
            
            System.out.println("Limpando a pilha"); 
            stack.clear();  

            System.out.println("A pilha está limpa? " + stack.isEmpty()); 
    }
}