package com.company;

public class Main {

    public static void main(String[] args) {
	Node myNode = new Node(13);
    myNode.display();
    int[] data = {1,2,4,12,3,5};
    LinkedList myList = new LinkedList(data);
    myList.display();
    myList.addNode(69);
    myList.display();
    System.out.println(myList.size());


    }
}
