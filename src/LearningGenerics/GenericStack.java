package LearningGenerics;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(E item){
        list.add(item);
    }

    public E pop(){
//            list.remove(list.size() - 1);
            return list.remove(list.size() - 1);
    }

    public E peek(){
        return list.get(list.size() - 1);
    }

    public int size(){
        return list.size();
    }

    public void display(){
//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }

        for (E listItem : list){
            System.out.println(listItem);
        }
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack();
        GenericStack<Integer> scores = new GenericStack();
        stack.push("Noah");
        stack.push("Ridoh");
        stack.push("Adeolu");
        stack.push("Isaiah");
        stack.push("Chidinma");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
