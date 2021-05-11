package test1;

import java.util.Scanner;

public class GetSibling {

	public static void getSibling(int tree[], int index) {

		int limit = tree.length - 1;

		if (index <= limit && index != 0 && index > 0) {

			int node = index;

			int root = (node - 1) / 2;

			int leftChild = tree[(2 * root) + 1];

			int rightChild = 0;

			if ((2 * root) + 2 < limit) {
				rightChild = tree[(2 * root) + 2];

				if (leftChild == tree[node]) {
					System.out.println("Sibling of " + tree[node] + " is " + rightChild + ". ");
				} else if (rightChild == tree[node]) {
					System.out.println("Sibling of " + tree[node] + " is " + leftChild + ". ");
				}
			} else
				System.out.println("There is no sibling to this node.");
		} else if (index == 0) {
			System.out.println("There is no sibling to this node.");
		} else
			System.out.println("This node doesn't exist in the tree.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tree[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter index: ");
		
		String index0 = sc.next();
		
		int index1 = Integer.parseInt(index0);

		getSibling(tree, index1);
		
		sc.close();

	}

}
