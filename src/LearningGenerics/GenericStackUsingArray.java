package LearningGenerics;

import java.util.Arrays;

public class GenericStackUsingArray<E> {
    //    isEmpty(), isFull(), push, pop, peek, size()
    //    int[] list = new int[4];
    private E[] list;
    private int capacity;
    private int numberOfProperties;

    public GenericStackUsingArray(int capacity) {
        this.list = (E[]) new Object[capacity]; //casting to E[]
    }

    public boolean isEmpty(){
        for (E listItem : list){
            if (listItem != null){
                return false;
            }
        }
        return true;
    }

    public void push(E property){
        if (numberOfProperties < list.length){
            list[numberOfProperties] = property;
            numberOfProperties++;
        } else {
            System.out.println("Property list is full");
        }
    }
    public boolean isFull(){
        return list.length > capacity;
    }

    public E pop(){

//        E storage;
//        for (int i = list.length - 1; i >= 0; i--) {
//            if (list[i] != null) {
//                storage = list[i];
//                list[i] = null;
//                break;
//            }
//        }
        E storage = list[numberOfProperties - 1];
        numberOfProperties--;
        list[numberOfProperties] = null;

//        int index = 0;
//        for (int i = 0; i < list.length; i++){
//            if (list[i] != null && list[i].toString().equalsIgnoreCase(String.valueOf(numberOfProperties-1))){
//                storage[index] = list[i];
//                list[i] = null;
//            }
//        }
        return storage;
    }

    public E peek(){
//        E[] storage = (E[]) new Object[1];
//        int index = 0;
//        for (int i = 0; i < list.length; i++){
//            if (list[i] != null && String.valueOf(list[i]).equalsIgnoreCase(String.valueOf(list.length-1))){
//                storage[index] = list[i];
//            }
//        }
//        return Arrays.toString(storage);
        return list[numberOfProperties - 1];
    }

    public int size(){
        int count = 0;
        for (E element : list){
            if (element != null){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        GenericStackUsingArray<String> stack = new GenericStackUsingArray<>(5);
        GenericStackUsingArray<Integer> scores = new GenericStackUsingArray<>(10);
        System.out.println(stack.isEmpty());
        stack.push("Noah");
        stack.push("Ridoh");
        stack.push("Adeolu");
        stack.push("Isaiah");
        stack.push("Isaiah");
        System.out.println(stack.isFull());
        stack.push("Chidinma");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }


}
