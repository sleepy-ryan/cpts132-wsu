package cpts132.data_structures;

public class MySimpleSet<E extends Comparable<E>> implements SimpleSet<E> {

    private Node<E> root;

    private int size;


    public MySimpleSet() {

        root = null;

        size = 0;

    }

    @Override
    public boolean add(E e) {

        if (contains(e)) {

            return false;

        }

        Node<E> newNode = new Node<E>(e);

        if (root == null) {

            root = newNode;

        } else {

            add(root, newNode);

        }

        size++;

        return true;

    }

    private boolean add(Node<E> root, Node<E> newNode) {

        if (root.getData().compareTo(newNode.getData()) > 0) {

            if (root.getLeft() == null) {

                root.setLeft(newNode);

                return true;

            } else {

                return add(root.getLeft(), newNode);

            }

        } else {

            if (root.getRight() == null) {

                root.setRight(newNode);

                return true;

            } else {

                return add(root.getRight(), newNode);

            }

        }

    }

    @Override
    public void clear() {

        root = null;

        size = 0;

    }

    @Override
    public boolean contains(E e) {

        if (root == null) {

            return false;

        }

        return contains(root, e);

    }

    private boolean contains(Node<E> root, E data) {

        if (root == null) {

            return false;

        }

        if (root.getData().compareTo(data) > 0) {

            return contains(root.getLeft(), data);

        } else if (root.getData().compareTo(data) < 0) {

            return contains(root.getRight(), data);

        } else {

            return true;

        }

    }

    @Override
    public boolean isEmpty() {

        return size == 0;

    }

    @Override
    public int size() {

        return size;

    }

    @Override
    public String toString() {

        return toString(root);

    }

    private String toString(Node<E> root) {

        String str = "(";

        if (root == null) {

            str += ")";

            return str;

        }

        str += root.getData() + " ";

        str += toString(root.getLeft()) + " ";

        str += toString(root.getRight());

        str += ")";

        return str;

    }

}

