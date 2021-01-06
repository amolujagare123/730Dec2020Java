package CollectionDemos;

import java.util.Stack;

public class StakDemo {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push(23);
        s.push(13);
        s.push(33);
        s.push(43);
        s.push(26);
        s.push(27);

        System.out.println(s.empty());// false
        System.out.println(s);

       /*

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);
*/

        System.out.println(s.search(26));


    }

}
