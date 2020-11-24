import java.util.Scanner;
import java.util.Arrays;

public class Trees {
        //declaration of variables
        class Node
        {
            int var;
            Node left;
            Node right;
            
            Node(int var)
            {
                this.var = var;
            }
        }       
        Node root;        
        public void addNode(int var)
        {
            //declare newNode
            Node newNode = new Node(var);
            //Start of the condition
            if(root == null)
            {
                root = newNode;
            }
            else
            {
                Node mainNode = root;
                Node par;
                //will continue if the condition is met
                while(true)
                {
                    par = mainNode; //MainNode will be the variable par
                    if (var < mainNode.var) //the condition if newNode is less than mainNode
                    {
                        mainNode = mainNode.left;
                        //if it has no child nodes
                        if(mainNode == null)
                        {
                            par.left = newNode;
                            return;
                        }
                    }
                    else //the condition if newNode is greater than mainNode
                    {
                        mainNode = mainNode.right;
                        //if it has no child nodes
                        if(mainNode == null)
                        {
                            par.right = newNode;
                            return;
                        }
                    }
                }
            }
        }
        //Inorder Traversal
        public static String inOrderTraversal(Node MainNode)
        {
            String traversal = "";
            //if the statement is true
            if(MainNode != null)
            {
                String left = inOrderTraversal(MainNode.left);
                String node = Integer.toString(MainNode.var);
                String right = inOrderTraversal(MainNode.right);
                traversal = left + node + " " + right;
            }
            return traversal;
        }
        //Preorder Traversal
        public static String preOrderTraversal(Node MainNode)
        {
            String traversal = "";
            //if the statement is true
            if(MainNode != null)
            {
                String node = Integer.toString(MainNode.var);
                String left = preOrderTraversal(MainNode.left);
                String right = preOrderTraversal(MainNode.right);
                traversal = node + " " + left + right;
            }
            return traversal;
        }
         //Postorder Traversal
        public static String postOrderTraversal(Node MainNode)
        {
            String traversal = "";
            //if the statement is true
            if(MainNode != null)
            {
                String left = postOrderTraversal(MainNode.left);
                String right = postOrderTraversal(MainNode.right);
                String node = Integer.toString(MainNode.var);
                traversal = left + right + node + " ";
            }
            return traversal;
        }
        //Driver code
        public static void main(String[]args)
        {
            Trees Binary_Tree = new Trees();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter how many number of elements: ");
            int size = input.nextInt();
            System.out.print("Enter the value of elements inside the binary tree: ");
            int arr[] = new int[size];
            //Loop
            for(int i = 0 ; i < size; i++)
            {
                int num = input.nextInt();
                Binary_Tree.addNode(num);
                arr[i] = num;
            }
            System.out.println();
            System.out.println("Full Binary Tree: ");
            for (int i = 0; i < size; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();System.out.println();
            //output for Inorder Traversal of the tree
            System.out.println("Inorder Traversal: ");
            String inOrder = inOrderTraversal(Binary_Tree.root);
            System.out.print(inOrder);
            System.out.println();
            
            //output for Preorder Traversal of the tree
            System.out.println("Preorder Traversal: ");
            String preOrder = preOrderTraversal(Binary_Tree.root);
            System.out.print(preOrder);
            System.out.println();
            
            //output for Postorder Traversal of the tree
            System.out.println("Postorder Traversal: ");
            String postOrder = postOrderTraversal(Binary_Tree.root);
            System.out.print(postOrder);
            System.out.println();
        }
}
