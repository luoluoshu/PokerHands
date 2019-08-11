import java.util.ArrayList;
import java.util.List;

public class ComparePoker {
    private final static int LENGTH = 15;
    private List<Poker> a = new ArrayList<>();
    private List<Poker> b = new ArrayList<>();
    private int[] listA= new int[LENGTH];
    private int[] listB= new int[LENGTH];

    public ComparePoker(){

    }
    public Poker compare(Poker a, Poker b){
        if (a.getPokerSize() > b.getPokerSize()){
            print(a);
            return a;
        }else {
            print(b);
            return b;
        }
    }
    public List<Poker> compare(List<Poker> a, List<Poker> b){
        this.a = a;
        this.b = b;
        this.listA = initList(a);
        this.listB = initList(b);
        findPairAndThree(this.listA);
        findPairAndThree(this.listB);
        return compareHand(this.listA,this.listB);
    }

    public void findPairAndThree(int[] array){
        for (int i = 0; i <13 ; i++) {
            if (array[i] == 2){
                array[13]++;
            }else if (array[i] == 3){
                array[14]++;
            }
        }
    }

    private List<Poker> compareHand(int[] A, int[] B){
        int aMaxIndex = getListMax(A);
        int bMaxIndex = getListMax(B);
        if (getListMax(A)> getListMax(B)){
            print(a);
            return this.a;
        }else if (getListMax(A)< getListMax(B)){
            print(b);
            return this.b;
        }else if (A[getListMax(A)]==B[getListMax(A)]){
            int[] newA = new int[getListMax(A)+1];
            int[] newB = new int[getListMax(A)+1];
            System.arraycopy(A, 0, newA, 0, aMaxIndex);
            System.arraycopy(B, 0, newB, 0, aMaxIndex);
            return compareHand(newA, newB);
        }else {
            return A[getListMax(A)]>B[getListMax(A)] ? this.a:this.b;
        }
    }

    public int getListMax(int[] a){
        for (int i = a.length-1; i >=0 ; i--) {
            if (a[i] > 0){
                return i;
            }
        }
        return 0;
    }

    public int[] initList(List<Poker> a){
        int[] array = new int[LENGTH];
        for (Poker p: a
             ) {
            array[p.getPokerSize()-2]++;
        }
        return array;
    }

    public void print(Poker a){
        System.out.println("Poker: "+a.getSize()+a.getSuit()+" is win!");
    }
    public void print(List<Poker> b){
        System.out.println("Pokers: ");
        for (Poker a:
             b) {
            System.out.print(a.getSize()+a.getSuit());
        }
        System.out.println(" is win!");
    }

    public void setA(List<Poker> a) {
        this.a = a;
    }

    public void setB(List<Poker> b) {
        this.b = b;
    }

    public List<Poker> getA() {
        return a;
    }

    public List<Poker> getB() {
        return b;
    }
}
