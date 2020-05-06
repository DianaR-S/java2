public class Animal {

    public Animal(){
    }
    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    String name;
    String kind;
    boolean gender;
    int age;
}
