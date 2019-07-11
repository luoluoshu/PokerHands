public class Person {
    private String name = "xinsu";
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile.clone();
    }

    public Person(String name){
        this.name = name;
        ;
    }

    public void useMobile(String message){
        this.mobile.call(message);
    }
}
