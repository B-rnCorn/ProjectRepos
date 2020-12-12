package com.project.abstract_tree;

import java.util.LinkedList;

public class Node <T>{
    private int idNode;
    private T value;
    private LinkedList<Node> children;
    private Node parent;

    // Конструкторы
    public Node(int idNode,T value,Node parent){
        this.idNode=idNode;
        this.value=value;
        this.parent=parent;
        this.children = new LinkedList<>();
    }

    public Node(int idNode,T value){
        this(idNode, value, null);
    }

    public Node(){
        this(0, (T) new Object());
    }

    //Геттреры и сеттеры атрибутов
    public void setChildren(int idNode,T value,Node parent){
        children.add(new Node(idNode,value,parent));
    }

    public void setChildren(Node node){
        children.add(node);
    }
    public void setChildren(LinkedList<Node> children){
        this.children=children;
    }

    public LinkedList<Node> getChildren(){
        return children;
    }

    public int getIdNode(){
        return idNode;
    }

    public void setIdNode(int idNode){
        this.idNode=idNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    //Клонирование
    public Node cloneNode(){
        Node cloned= new Node (this.idNode,this.value,this.parent);
        cloned.setChildren(this.children);
        return cloned;
    }
}
