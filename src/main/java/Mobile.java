

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Mobile(){
        ;
    }

//    public void call(){
//        System.out.println("Message : [your input message]");
//    }

    public void call(String message){
        System.out.println("Message : ["+ message +"]");
    }

    public void getInfo(){
        System.out.println("name: [" + this.name + "], color: [" + this.color + "], brand: [" + this.brand + "]");
    }
}
