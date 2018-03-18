package com.practice.tree;

/**
 * Created by UDAY on 3/17/2018.
 */
public class Node {
    private Node node;
    private int data;

    public Node(int data){
        this.data = data;
    }
    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
