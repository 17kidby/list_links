package com.company;

public class LinkedList {
    private Node head;


    public LinkedList(){
        // making an empty list
        head = null;
    }

    public LinkedList(int[] values){
        head = new Node(values[0]); // hoping that this array already has one element
        Node adding;
        Node current = head;
        for (int i=1; i<values.length; i++){
            adding = new Node(values[i]);
            current.setNext(adding);
            current = current.getNext();
        }

    }


    public void display(){ //displayes each element on the same line
        Node current = head;
        while (current != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void addNode(int v){
        Node newNode = new Node(v);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void addNode(int index, int n){
        Node newNode = new Node(n);
        Node current = head;
        for (int i=0; i<index-2; i++){
            current = current.getNext();
        }
        current.setNext(newNode);

        while (current.getNext() != null){
            current = current.getNext();
        }
    }

    public int getFirst(){
        Node current = head;
        return head.getValue();
    }

    public int getLast(){
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return(current.getValue());
    }


    public void addFirst(int n){
        Node newNode = new Node(n);
        Node current = head;
        int temp;
        temp= current.getValue();
        current.setValue(n);
        while (current.getNext() != null){
            current.getNext();

        }
    }

    public int size(){
        Node current = head;
        int counter = 0;
        while (current != null){
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    public Node remove(int index){

    }

}
