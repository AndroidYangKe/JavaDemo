public class RevertNodesDemo {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.mNext = node2;
        node2.mNext = node3;

        printNodes(node1);
        Node newNode = revertNodes(node1);
        printNodes(newNode);
    }

    static class Node {
        public int mValue;
        public Node mNext;
        public Node(int value) {
            this.mValue = value;
        }
    }

    public static Node revertNodes(Node node) {
        if (node == null || node.mNext == null){
            return node;
        }

        Node preNode = null;
        Node nextNode = null;
        while (node != null){
            nextNode = node.mNext;
            node.mNext = preNode;
            preNode = node;
            node = nextNode;
        }

        return preNode;
    }

    public static void printNodes(Node nodes) {
        while (null != nodes) {
            System.out.println("value-->"+nodes.mValue);
            nodes = nodes.mNext;
        }
    }

}
