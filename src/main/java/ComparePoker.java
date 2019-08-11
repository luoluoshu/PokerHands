import java.util.ArrayList;
import java.util.List;

public class ComparePoker {
    private List<Poker> a = new ArrayList<>();
    private List<Poker> b = new ArrayList<>();
    private int[] listA= new int[13];
    private int[] listB= new int[13];

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
        if (getListMax(listA)> getListMax(listB)){
            print(a);
            return a;
        }else {
            print(b);
            return b;
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
        int[] array = new int[13];
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
