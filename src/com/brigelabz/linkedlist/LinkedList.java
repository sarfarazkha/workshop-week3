package com.brigelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;


    public void push(T data) {
        Node<T> obj1 = new Node<>(data);
        if (obj1 == null) {
            head = obj1;
            tail = obj1;
        } else {
            obj1.next = head;
            head = obj1;
        }
    }

    public void add(T data) {
        Node<T> obj2 = new Node<>(data);
        if (head == null) {
            head = obj2;
            tail = obj2;
        } else {
            tail.next = obj2;
            tail = obj2;
        }
    }

    public void insertBetween(T insertData) {
        Node<T> obj2 = new Node<>(insertData);
        head.next = obj2;
        obj2.next = tail;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;


        }
    }

    public Node<T> Search(T searchData)
    {
        Node<T> temp=head;
        Node<T> searchedNode=null;
        while(temp!=null)
        {
            if(temp.data.equals(searchData))
            {
                searchedNode=temp;

            }
            temp=temp.next;
        }
        return searchedNode;
    }
}
