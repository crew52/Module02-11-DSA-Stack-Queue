package bt3;

public class Node {
    private int data;
    private Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return link;
    }
}
