public class ComparePoker {
    private Poker a;
    private Poker b;

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

    public void print(Poker a){
        System.out.println("Poker: "+a.getSize()+a.getSuit()+" is win!");
    }

    public void setA(Poker a) {
        this.a = a;
    }

    public void setB(Poker b) {
        this.b = b;
    }

    public Poker getA() {
        return a;
    }

    public Poker getB() {
        return b;
    }
}
