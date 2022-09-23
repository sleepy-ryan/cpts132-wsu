import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class MyTreeMap<K, V> implements BetterMap {


     //size of structure

    private int size;

    //root of the binary tree

    private BinaryTree root;

    public MyTreeMap(){


        root = null;

        size = 0;
    }

    @Override
    public void put(Object key, Object value) {
        if (key == null || value == null) throw new IllegalArgumentException("Key or value cannot be null");
        helpPutTree(root, key, value);
    }


    private void helpPutTree(BinaryTree r, K key, V value) {

        if (r == null){
            r = new BinaryTree() {
                @Override
                public Kind getKind() {
                    return null;
                }

                @Override
                public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                    return null;
                }

                @Override
                public ExpressionTree getLeftOperand() {
                    return null;
                }

                @Override
                public ExpressionTree getRightOperand() {
                    return null;
                }
            };
            size++;
        }

        @SuppressWarnings("unchecked")
        int compare = r.key.compareTo(key);


        if (compare == 0) r.value = value;


        else if
        (compare > 0) helpPutTree(r.left, key, value);
        else
            helpPutTree(r.right, key, value);
    }


    @Override
    public V get(Object key){

        return helpGetTree(root, key);

    }


    private V helpGetTree(BinaryTree r, Object key) {


        if (r == null)
            return null;

// Otherwise
        @SuppressWarnings("unchecked")
        int compare = r.key.compareTo(key);


        if (compare == 0)
            return r.value;
        else if (compare > 0)
            return helpGetTree(r.left, key);
        else
            return helpGetTree(r.right, key);
    }

    @Override
    public boolean isEmpty(){

        return size == 0;
    }


    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean containsValue(Object value){

        return helpContainsValueTree(root, value);

    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    public boolean helpContainsValueTree(BinaryTree r, Object value){


        if(r == null){
            return false;
        }

        else if(r.value == value){
            return true;
        }

        else{

            return helpContainsValueTree(r.left, value) || helpContainsValueTree(r.right, value);
        }
    }

}