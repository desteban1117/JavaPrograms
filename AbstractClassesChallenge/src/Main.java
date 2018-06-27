public class Main {

    public static void main(String[] args) {

        MyLinkList list = new MyLinkList(null);

        list.traverse(list.getRoot());

        String stringData = "0 1 3 5 9 8 6 7 2 4";

        String[] data = stringData.split(" ");

        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());


    }
}
