

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

    public Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
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

    public Mobile clone(){
        Mobile result = new Mobile(this.name, getColor(), getBrand());
        return result;

    }
}
