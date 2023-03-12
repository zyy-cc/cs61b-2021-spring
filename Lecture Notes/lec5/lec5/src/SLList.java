public class SLList {
    // An SLList is a list of integers, which
    // hides the terrible truth of the nakedness within
    private static class IntNode {
//        because no one outside will use Intnode,
//        therefore, we can make it static
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }
// The first item (if it exists) is at sentinel.next.
    private IntNode sentinel;
    private int size;
    public SLList(int x){
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    public SLList(){
        // create an empty SLList.
        size = 0;
        sentinel = new IntNode(63,null);
    }

//    Adds x in front of the list
    public void addFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size += 1;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
//        if (first == null){
//            first = new IntNode(x, null);
//            return;
//        }

        IntNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size += 1;
    }

//    private static int size(IntNode p){
//        if (p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }

    public int size(){
//        return size(first);
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }
}
