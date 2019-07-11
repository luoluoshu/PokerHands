

public class Andriod extends Mobile {
    private int messageLength = 20;

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if (message.length() > this.messageLength){
            System.out.println("<Andriod> Message cannot be sent");
        }else
        System.out.println("AndriodMessage : ["+ message +"]");
    }

    public Andriod clone() {
        return  new Andriod(getName(), getColor(), getBrand());
    }
}
