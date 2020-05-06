public class Student {

    public Student(){ //без параметров
        System.out.println("Hello from Student Constructor");
    }
    public Student(String firstName){
        this.firstName = firstName;
    }

    public Student(int age, String lastName){
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;

    }
        int age;
    String firstName;
    String lastName;
    String email;
    String group;
    long idCode;

    public void  changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public void getOlder(){
        //this.age = this.age +1;
        this.age++;
    }


}
