public class IPhoneRobot extends Person {

    public IPhoneRobot(String name){
        super(name);
    }

    @Override
    public void useMobile( String message) {
        if (this.getMobile() instanceof IPhone) {
            super.useMobile(message);
        }else {
            System.out.println(" it can only use IPhone!");
        }
    }

    @Override
    public void setMobile(Mobile mobile) {
        if (mobile instanceof IPhone)
             super.setMobile(mobile);
        else
            System.out.println("it can only use IPhone!");
    }
}
