
class Node {
    int key, info;            // info ist optional
    Node left, right, parent; // parent ist optional
}

int height(Node node) {
	if (node = NULL) return 0;
	return height;
}

Node insert(Node node, int x) {
    if (node == NULL)
        return new Node(x, NULL, NULL);

    if (node.key > x)
        node.left = insert(node.left, x);
    else
        node.right = insert(node.right, x);
    return node;
}

void inorder(Node node) {
    if (node == NULL) return;
    inorder(node.left) // linke Hälfte
    print(node)
    inorder(node.right) // rechte Hälfte
}