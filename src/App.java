
import controllers.Cola;
import controllers.ColaG;
import controllers.MiStack;
import controllers.StackG;
import ejercicio_01_sign.SignValidator;
import ejercicio_02_sorting.StackSorter;
import models.Persona;
import java.util.Stack;


public class App {
    public static void main(String[] args) throws Exception {
        MiStack stack = new MiStack();
        stack.push(10);
        stack.push(-1);
        stack.push (0);
        stack.push(5);
        stack.printstack();
        stack.pop();
        stack.peek();
        stack.printstack();

        //Stack Generica
        System.out.println("\nStack Generica");

        StackG<Integer> stackG = new StackG<Integer>();
        stackG.push(1);
        stackG.push(4);
        stackG.printStack();

        StackG<String> stackG1 = new StackG<String>();
        stackG1.push("Uno");
        stackG1.push("Cuatro");
        stackG1.printStack();

        //FIFO=frist in first out
      
        System.out.println("\nColas");

        // Cola no generica
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam = " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam = " + cola.size);
        cola.printCola();

        System.out.println("Peek: " + stack.peek());
        // Cola generica

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        System.out.println("\nCola Generica");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println("Tam = " + colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiende a la persona: " + colaPersonas.remove().getNombre());
        System.out.println("Tam = " + colaPersonas.size());
        colaPersonas.printCola();
        

        System.out.println("Maria esta en la posicion "+colaPersonas.findByName("Maria"));
        System.out.println("Elimina");
        colaPersonas.removeByName("David");
        colaPersonas.printCola();

        SignValidator validator = new SignValidator();

        System.out.println(validator.isValid("([]){}"));    
        System.out.println(validator.isValid("({)}"));     

        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(1);
        pila.push(4);
        pila.push(2);

        StackSorter sorter = new StackSorter();
        sorter.sortStack(pila); 

        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");  // 1 2 4 5
        }
       

    }
}
