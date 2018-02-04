package examples;

import org.junit.Test;

public class StackTest {


    @Test
    public void  testStack(){
        int n = 67 ;
        if((n == 1 )|| (n == 2)){
            System.out.println("prime");
        }
        for (int i=2; i< n/2 ; i++){
            if(n%i > 0){
                System.out.println("not prime");
                break ;
                //System.exit(Integer.parseInt(""));
            }
            return ;
        }

        System.out.println("prime");

      /*
        Stack stack = new Stack(10000);
        //showMemoryUse(); // before using the stack

        for (int i = 0; i < 10000; i++) { // fill the stack
            stack.push("a large, large, large, large, string " + i);
        }
        for (int i = 0; i < 10000; i++) { // empty the stack
            System.out.println(stack.pop());
        }
*/
        //showMemoryUse(); // after using the stack
    }
}
