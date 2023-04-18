package com.company;

import javax.print.attribute.standard.NumberUp;

public class Main {

    public static void main(String[] args) {

        LinkedStack<Integer> Numbers = new LinkedStack<>();
        Numbers.push(10);
        Numbers.push(20);
        Numbers.push(30);
        Numbers.push(100);
        Numbers.push(400);



        System.out.println("Numbers  Size is: " + Numbers.size());
        System.out.println("Top Number: " + Numbers.peek());
        int out =Numbers.pop();
        System.out.println("Removed Number: " + out);
        System.out.println("Top Number: " + Numbers.peek());

        Numbers.displayStack();

      Numbers.max();




    }
}
