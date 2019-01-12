package ArrayList;

public class RLEIterator {
    private int curIndex;
    private int[] A;
    public RLEIterator(int[] A) {
        this.A = A;
        this.curIndex = -1;
    }

    public int next(int n) {
        curIndex += n;
        return A[curIndex];
    }

    public static void main(String[] args) {
        int[] A = {3,8,0,9,2,5};
        RLEIterator rleIterator = new RLEIterator(A);
        System.out.println(rleIterator.next(2));
        System.out.println(rleIterator.next(1));

    }
}
