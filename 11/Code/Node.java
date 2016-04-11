
class Node {
	int key;
	Node left, right;
	int height;
}

int height(Node node) {
	if (node = null) return 0;
	return height;
}

Node rotateRight(Node y) {
	Node x = y.left;
	Node T2 = x.right;
	y.left = T2;
	x.right = y;
	y.height = 1+max(height(y.left), height(y.right));
	x.height = 1+max(height(x.left), height(x.right));
	return x;
}

Node rotateLeft(Node y) {
    //analog
}

Node insert(Node node, int key) {
	if (node == null) return new Node(key);
	if (key < node.key)
		node.left = insert(node.left, key);
	else
		node.right = insert(node.right, key);
	
	if (balance(node)>1 && key < node.left.key)
		return rotateRight(node);
	if (balance(node)<-1 && key > node.right.key)
		return rotateLeft(node);
	if (balance(node)>1 && key > node.left.key) {
		node.left = rotateLeft(node.left);
		return rotateRight(node);
	}
	if (balance(node)<-1 && key < node.right.key) {
		node.right = rotateRight(node.right);
		return rotateLeft(node);
	}
	return node;
}