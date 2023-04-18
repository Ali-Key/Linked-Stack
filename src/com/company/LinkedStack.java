package com.company;

import java.util.EmptyStackException;

public class LinkedStack <T> {

    private int count;
    private Node <T> top;

    public LinkedStack (){
        count=0;
        top=null;
    }

    //SIZE
    int size(){
        return count;
    }

    //ISEMPTY
    boolean isempty(){
        return  count==0;
    }

    //PUSH
    public void push( T NUM){
        Node <T> temp = new Node <> (NUM);
        temp.setNext(top);
        top=temp;
        count ++;
    }
    //PEEK
    public T peek() throws EmptyStackException{
        if(isempty())
            throw new EmptyStackException();
            return top.getElement();
    }
    //POP
    public T pop() throws EmptyStackException{
        if(isempty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }
    //DAPLAY
    public void displayStack() throws EmptyStackException{
        if(isempty())
            throw new EmptyStackException();
        Node<T> current=top;
        while (current!=null){

            System.out.println(current.getElement());
            current=current.getNext();
        }




    }





//MAX
    public int max(){
//

        Node<T> current = top;
        int max =0;

        while (current != null){
            if ((int)(current.getElement())<max)
                max =(int) current.getElement();
            current= current.getNext();

        }

        return max;
}





















//   counter
//    int counter(T element) {
//        Node<T> current = top;
//        int number = 0;
//        while (current != null) {
//            if (element.equals(current.getElement()))
//                number++;
//            current = current.getNext();
//        }
//        return number;
//
//    }

//MINUMUM
 //   public int getMin(){
//        if (isempty())
//            System.out.println("is empty");
//        Node<T> temp = top;
//        int min = (int) (temp.getElement());
//        while (temp != null){
//
//            if (min <  (int) (temp.getElement())) {
//                min = (int) (temp.getElement());
//            }
//
//
//
//
//              temp = temp.getNext();
//            }
//
//            return min;
//
//}


    //Search
//
//    boolean searchElement(T searchdata){
//        Node<T> current = top;
//        boolean found = false;
//
//        while (current != null){
//            if(searchdata.equals(current.getElement()))
//                found = true;
//            current = current.getNext();
//        }
//        return found;
//    }



}

