package cpts132.data_structures;

public class Node<E> {

    private E data;

    private Node<E> leftChild;

    private Node<E> rightChild;

    //constructor

    public Node(E data) {

        this.data = data;

        leftChild = null;

        rightChild = null;

    }


    public E getData() {

        return data;

    }

    public void setData(E data) {

        this.data = data;

    }

    public Node<E> getLeft() {

        return leftChild;

    }

    public void setLeft(Node<E> left) {

        this.leftChild = left;

    }

    public Node<E> getRight() {

        return rightChild;

    }

    public void setRight(Node<E> right) {

        this.rightChild = right;

    }

}