public class Car {
    public Car() {
    }
    String model;
    int price;
    int age;
    String color;
    String firm;


    public void changePrice(int newPrice) {
        this.price = newPrice;
    }

    public void getOlder(){
        this.age++;
    }
}

