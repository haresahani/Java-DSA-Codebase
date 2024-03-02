import java.util.Stack;
//or import java.util.*;

public class StackFrmWrk{
    public static void main(String[] args){
        // stack s = new stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}