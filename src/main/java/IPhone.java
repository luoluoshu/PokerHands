

public class IPhone extends Mobile{
    private int messageLength = 10;

    public int getMessageLength() {
        return messageLength;
    }

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if (message.length() > this.messageLength){
            System.out.println("<iPhone> Message cannot be sent");
        }else
        System.out.println("<iPhone>Message : ["+ message +"]");
    }


    public IPhone clone() {
        return  new IPhone(getName(), getColor(), getBrand());
    }
}
