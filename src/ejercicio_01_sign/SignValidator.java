package ejercicio_01_sign;
import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (char z: s.toCharArray()){
            if(esApertura(z)){
                stack.push(z);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
            
            char max= stack.pop();
            if ((z == ')' && max != '(') ||
                (z == ']' && max != '[') ||
                (z == '}' && max != '{')) {
                    return false;
                }
            }        
            

        }
        
        return stack.isEmpty();
    }


    public boolean esApertura (char c){
        return c=='('|| c=='['| c=='{';
    }

    
    
}
