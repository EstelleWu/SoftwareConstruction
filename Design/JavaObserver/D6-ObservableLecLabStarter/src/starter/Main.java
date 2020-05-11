package starter;

public class Main {
    public static void main(String[] args) {
        Branch tree = new Branch("tree");
        Branch b1 = new Branch("b1");
        tree.grow(b1);
        LeafMonitor monitor = new LeafMonitor("Andy's LM");
        b1.grow(new Leaf("leafy",monitor));
        b1.grow(new Leaf("leafyman",monitor));
        tree.changeColor();
        tree.changeColor();
        tree.changeColor();
    }
}
