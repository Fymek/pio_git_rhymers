package edu.kis.vh.nursery;


import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListDemo {
    public static void main(String[] args) {
        IntLinkedList factory = new IntLinkedList();
        testLinkedList(factory);
    }

    private static void testLinkedList(IntLinkedList list) {
        list.push(1);
        list.push(2);
        System.out.println("Ostatnio dodana wartość: " + list.top() );
        list.pop();
        System.out.println("Ostatnio dodana wartość: " + list.top() );
        list.pop();
        if(list.isEmpty())
            System.out.println("Lista jest pusta");
    }


}