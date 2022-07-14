import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree
{


        private Node root;

        public BinarySearchTree(){
            this.root=null;
        }


        class Node {

            Node left;
            Node right;
            int data;
        


        public Node(int data)

        {

            this.data=data;
            left=right=null;

        }
    }

        public boolean isEmpty()
        {
            return root==null;
        }

        public void insert(int data)
        {
        
               this.root= insertRecursive(this.root,data);
        
        }


            private Node insertRecursive(Node root,int data)
            {

         

                    if(root==null)
                    {
                        root=new Node(data);
                    }

                    else if(root.data > data)
                    {
                        root.left=insertRecursive(root.left,data);
                    }

                    else {
                        root.right=insertRecursive(root.right,data);
                    }

                return root;

            }


            public Node findMin(Node node)
            {
                
                while(node.left!=null)
                {
                    node=node.left;
                }
                return node;
            }


           
            public void delete(int n)
            {
                this.root=deleteRecursive(this.root,n);
            }


            private Node deleteRecursive(Node root, int val)
        {


            if(root==null) return root;

            if(val<root.data){
                root.left=deleteRecursive(root.left, val);
            }

            else if(val>root.data)
            {
                root.right=deleteRecursive(root.right, val);
            }

            else { //we found him :) 


            // case 1: no children

            if(root.left==null && root.right==null)
            {
                root=null;
            }

            // case 2: one child

           else if(root.left==null)

            {
                root=root.right;

            }

            else if(root.right==null)
            {

                root=root.left;

            }

            else    //case 3
            {


                Node min = findMin(root.right);

                root.data=min.data;

                root.right=deleteRecursive(root.right, root.data);



            }

            }

            return root;
        }



                void levelOrder()
                {


                levelOrderRecursive(root);
                    

                }


                private void levelOrderRecursive(Node root)
                {


                    Queue<Node> queue = new LinkedList<Node>();

                    queue.add(root);


                    while(!queue.isEmpty())
                    {


                    Node current = queue.poll();

                    System.out.print(current.data+" ");

                    if(current.left!=null) {
                        queue.add(current.left);
                    }

                    if(current.right!=null)
                    {
                        queue.add(current.right);
                    }
                    



                    }





                }

                public void size()
                {
                  int size=  sizeRecursive(root);

                  System.out.println("The size is "+size);


                }

                private int sizeRecursive(Node root)
                {

                    if(root==null)
                    {
                        return 0;
                    }

                    return 1+sizeRecursive(root.left)+sizeRecursive(root.right);

                }

                public void inOrder()
                {

                    inOrder(root);

                }

                private void inOrder(Node root)
                {


                    if(root==null)
                    {
                        return;
                    }

                    inOrder(root.left);
                    System.out.print(root.data+" ");
                    inOrder(root.right);


                }

                public static void main(String [] args)
                {


                    BinarySearchTree BST = new BinarySearchTree();

                    BST.insert(50);
                    BST.insert(30);
                    BST.insert(20);
                    BST.insert(40);
                    BST.insert(70);
                    BST.insert(60);
                    BST.insert(80);

                    BST.delete(60);
                    


                    System.out.print("Level order- ");
                    BST.levelOrder();

                    System.out.println();


                    System.out.print("in order- ");
                   
                    BST.inOrder();

                 BST.size();
                    


                }


}