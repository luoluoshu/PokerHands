import java.util.ArrayList;
import java.util.List;

public class ComparePoker {
    private final static int LENGTH = 14;
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
        findPair(this.listA);
        findPair(this.listB);
        if (getListMax(listA)> getListMax(listB)){
            print(a);
            return a;
        }else {
            print(b);
            return b;
        }
    }

    public void findPair(int[] array){
        for (int i = 0; i <13 ; i++) {
            if (array[i] == 2){
                array[13]++;
            }
        }
    }

    public int getListMax(int[] a){
        for (int i = a.length-1; i >=0 ; i--) {
            if (a[i] > 0){
                return i+2;
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
