package trees;

//@author softnrajkumar1994@gmail.com mobile : +918903425725

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnbalancedBinarySearchTree
{
	public int data = -1;
	public UnbalancedBinarySearchTree left,right;

	public UnbalancedBinarySearchTree(int data)   
	{
		this.data = data;  
	}

	public void insert(int data)
	{
		if(this.data >= data)
		{
			if (this.left == null)
			{
				this.left = new UnbalancedBinarySearchTree(data);
			}
			else
			{
				this.left.insert(data);
			}
		}
		else
		{
			if(this.right == null)
			{
				this.right = new UnbalancedBinarySearchTree(data);
			}
			else
			{
				this.right.insert(data);
			}
		}
	}

	public boolean isContainsByRecursion(int data)
	{
		if(this.data == data)
		{
			return true;
		}
		else if(this.data > data)
		{
			if(this.left == null)
			{
				return false;
			}
			return this.left.isContainsByRecursion(data);
		}
		else
		{
			if(this.right == null)
			{
				return false;
			}
			return this.right.isContainsByRecursion(data);
		}
	}

	public boolean isContainsByLooping(int data)
	{
		UnbalancedBinarySearchTree temp = this;
		while(temp  != null)
		{
			if(temp.data == data)
			{
				return true;
			}
			else if(temp.data > data)
			{
				temp = temp.left;
			}
			else 
			{
				temp = temp.right;
			}
		}
		return false;
	}

	public static void doInorderTraversal(UnbalancedBinarySearchTree node)
	{
		if(node.left != null)
		{
			doInorderTraversal(node.left);
		}
		System.out.print(node.data + ",");
		if(node.right != null)
		{
			doInorderTraversal(node.right);
		}
	}


	public static void doPostorderTraversal(UnbalancedBinarySearchTree node)
	{
		if(node.left != null)
		{
			doPostorderTraversal(node.left);
		}

		if(node.right != null)
		{
			doPostorderTraversal(node.right);
		}
		System.out.print(node.data + ",");
	}

	public static void doPreorderTraversal(UnbalancedBinarySearchTree node)
	{
		System.out.print(node.data + ",");
		if(node.left != null)
		{
			doPreorderTraversal(node.left);
		}

		if(node.right != null)
		{
			doPreorderTraversal(node.right);
		}
	}

	public static void main(String[] args)
	{
		UnbalancedBinarySearchTree root = new UnbalancedBinarySearchTree(100);
		root.insert(12);
		root.insert(13);
		root.insert(1);
		root.insert(102);
		root.insert(101);
		root.insert(10);

		System.out.print("Pre order traversal : ");
		UnbalancedBinarySearchTree.doPreorderTraversal(root);
		System.out.print("\nIn order traversal : ");
		UnbalancedBinarySearchTree.doInorderTraversal(root);
		System.out.print("\nPost order traversal : ");
		UnbalancedBinarySearchTree.doPostorderTraversal(root);

		System.out.println("\nIs tree contains element 1000 : "+root.isContainsByLooping(1000));
		System.out.println("Is tree contains element 1000 : "+root.isContainsByRecursion(1000));

		System.out.println("Is tree contains element 102 : "+root.isContainsByLooping(102));
		System.out.println("Is tree contains element 102 : "+root.isContainsByRecursion(102));
	}
}
