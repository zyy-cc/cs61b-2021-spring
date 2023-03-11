public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList h){
        first = f;
        rest = h;
    }

    public int size(){
        if (rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }
    /*Return the size of the list using the iteration*/
    public int iterativeSize(){
        int len = 0;
        IntList l = this;
        while (l != null){
            len += 1;
            l = l.rest;
        }
        return len;
    }

    public static int gett(int i, IntList l){
        /*return the i-th item in the list*/
        if (i == 0){
            return l.first;
        }
        return gett(i-1,l.rest);
    }

    public int get(int i){
        if (i == 0){
            return first;
        }
        return rest.get(i-1);
    }

    public static void main(String[] args) {
        IntList L =  new IntList(15,null);
        L = new IntList(10,L);
        L = new IntList(5,L);
        System.out.println(L.size());

    }
}
