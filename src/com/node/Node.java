package com.node;

public class Node<T> {
    private T content;
    private Node<T> proxNode;


    public Node(T content){
    this.proxNode=null;
    this.content=content;
    }



    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getProxNode() {
        return proxNode;
    }

    public void setProxNode(Node<T> proxNode) {
        this.proxNode = proxNode;
    }
}
