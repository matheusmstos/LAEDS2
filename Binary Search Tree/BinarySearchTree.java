public class BinarySearchTree{
    Node root;

    BinarySearchTree(int key){
        root = new Node(key);
    }

    BinarySearchTree(){
        root = null;
    }

    public Node search(Node root, int key_search){
        if(root == null || root.key == key_search)
            return root;

        if(key_search < root.key){
            return search(root.left, key_search);
        }else{
            return search(root.right, key_search);
        }
    }

    public void insert(int key){
        root = insert_tree(root, key);
    }
    private Node insert_tree(Node root, int key){
        //criar o primeiro elemento/root
        if(root == null){
            root = new Node(key);
        }
        //se maior que o root, adiciona pra direito
        //se menor que o root, adiciona pra esquerda.
        //atualiza left e right

        if(key < root.key){
            if(root.left == null){
                root.left = new Node(key);
            }else{
                return insert_tree(root.left, key);
            }

        }
        else if(key > root.key){
            if(root.right == null){
                root.right = new Node(key);
            }else{
                return insert_tree(root.right, key);
            }
        }
         return root;
    }

    public void inorder(){
        in_order(root);
    }

    private void in_order(Node root){
        in_order(root.left);
        System.out.println(root.key);
        in_order(root.left);
    }
}
