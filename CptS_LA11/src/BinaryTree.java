public class BinaryTree {

    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){

            root = newNode;

        } else {

            Node focusNode = root;

            Node parent;

            while(true){

                parent = focusNode;

                if(key < focusNode.Key){

                    focusNode = focusNode.leftChild;

                    if(focusNode == null){

                        parent.leftChild = newNode;
                        return;
                    }

                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode ==  null){

                        parent.rightChild =  newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode){

        if(focusNode != null){

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode){

        if(focusNode != null){

            System.out.println(focusNode);

            preorderTraverseTree(focusNode.leftChild);

            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode){

        if(focusNode != null){

            preorderTraverseTree(focusNode.leftChild);

            preorderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }


    public static void main(String[] args) {
        BinaryTree theTree =  new BinaryTree();


        theTree.addNode(2, "a");
        theTree.addNode(3, "b");
        theTree.addNode(4, "c");
        theTree.addNode(5, "d");
        theTree.addNode(6, "e");

        theTree.inOrderTraverseTree(theTree.root);
        theTree.preorderTraverseTree(theTree.root);
        theTree.postOrderTraverseTree(theTree.root);


    }

}

class Node {
    int Key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.Key = key;

        this.name = name;
    }

    public String toString(){

        return name + " " + Key;
    }

}
