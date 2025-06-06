package ejercicio_02_sorting;
import java.util.Stack;

public class StackSorter {
    public void sortStack (Stack<Integer> stack){
        Stack<Integer> aux = new Stack<>();  // pila auxiliar

        while (!stack.isEmpty()) {
            int actual = stack.pop();

            // de aux a stack mientras tope > actual
            while (!aux.isEmpty() && aux.peek() > actual) {
                stack.push(aux.pop());
            }

            aux.push(actual);
        }

        //regresar a pila original
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }


    }
    
    
}
