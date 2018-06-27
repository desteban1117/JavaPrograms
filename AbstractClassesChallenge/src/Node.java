public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLinnk;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLinnk = item;
        return this.leftLinnk;
    }

    @Override
    int compareTo(ListItem item) {

        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}
