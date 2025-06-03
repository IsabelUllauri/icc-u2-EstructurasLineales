package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;

    public Stack() {
        this.top=null;
    }
    public void push (int getValue){
        Node newNode = new Node(getValue);
        newNode.setNext(top);//el primero nodo que llega su next es nulo
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException(); 
        }

        int value= top.getValue();//top.getvalue porque un nodo es directamente un valor
        top= top.getNext();
        return value;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printstack(){
        Node curret = top;
        while (curret!= null){
            System.out.println(curret.getValue());
            curret=curret.getNext();
        }
        System.out.println();
    }
}
