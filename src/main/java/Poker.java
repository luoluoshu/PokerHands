public class Poker {
    private String size;
    private  String suit;

    public Poker(){
        size = "2";
        suit = "C";
    }
    public Poker(String size){
        this.size = size;
        suit = "C";
    }
    public Poker(String size, String suit){
        this.size = size;
        this.suit = suit;
    }

    public int getPokerSize(){
        int result = 0;
        switch (this.size){
            case "2":
                result = 2;break;
            case "3":
                result = 3;break;
            case "4":
                result = 4;break;
            case "5":
                result = 5;break;
            case "6":
                result = 6;break;
            case "7":
                result = 7;break;
            case "8":
                result = 8;break;
            case "9":
                result = 9;break;
            case "T":
                result = 10;break;
            case "J":
                result = 11;break;
            case "Q":
                result = 12;break;
            case "K":
                result = 13;break;
            case "A":
                result = 14;break;
                default:
                    result = -1;
        }
        return result;
    }

    public String getSize() {
        return size;
    }

    public String getSuit() {
        return suit;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
