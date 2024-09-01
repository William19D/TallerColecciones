package Objects;

import java.util.Stack;

public class Pila<E> {
    private Stack<E> stack;

    public Pila() {
        stack = new Stack<>();
    }

    public boolean push(E element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return true;
        }
        E topElement = stack.peek();
        if (topElement.getClass().equals(element.getClass())) {
            stack.push(element);
            return true;
        } else {
            System.out.println("Error: El tipo del elemento no coincide con el tipo en la cima de la pila.");
            return false;
        }
    }

    public E pop() {
        if (stack.isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        return stack.pop();
    }

    public E peek() {
        if (stack.isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
