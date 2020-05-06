import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

public class Lesson6 {
    public static void main(String[] args) {
        //primitive type
        int i = 5;
        long l = 5l;
        boolean b = true;
        char ch = 't';

        //object type - объектный
        String str = "RTRT";

        Student anton = new Student();
        anton.firstName = "Anton";
        anton.age = 22;
        anton.group = "IT-8";

        anton.changeGroup("IT-99");
        anton.getOlder();

        //Student natali = new Student();
        Student natali = new Student("Natali");
        //natali.firstName = "Natali";
        natali.group = "FF-1";
        natali.age = 25;
        natali.changeGroup("FF-9");
        natali.getOlder();

        Student nik = new Student("Nik");
        nik.group = "FF-1";
        nik.age = 25;
        natali.changeGroup("FF-9");
        natali.getOlder();

        //anton = natali;
        anton = null;
        //HEAP - stores object
        //PERM GEM == METAINFO - store Classes
        //Stack - stores call stack

        //System.gc() - garbage collector;

        System.out.println("Objects are cool!");
        myMeth();

        //Animal: kind, name, gender
        Animal lion = new Animal();
        lion.name = "Leon";
        lion.gender = true;
        lion.kind = "cats";

        Animal cat = new Animal("Barsik", 2);
        Animal dog = new Animal("Pirat", 10);
        Animal pig = new Animal("Pepa", 1);

        Animal[] zoo = {cat, dog, pig};
        Animal oldest = getOldestAnimal(zoo);
        int maxAgeIndex = 0;
        //int maxAge = zoo[0].age;
        //String maxName = zoo[0].name;

       /* for (int j = 1; j < zoo.length; j++) {
            if (zoo[j].age > maxAge) {
                maxAge = zoo[j].age;
                maxName = zoo[j].name;
            }
        }*/
        for (int j = 1; j < zoo.length; j++) {
            Animal maxAgeAnimal = zoo[maxAgeIndex];
            Animal current = zoo[j];
            if (current.age > maxAgeAnimal.age) {
                maxAgeIndex = j;
            }
        }
        Animal oldestAnimal = zoo[maxAgeIndex];
        System.out.println("Max Name:" + oldestAnimal.name);
        System.out.println("Max Age:" + oldestAnimal.age);
        /*System.out.println("Max Name:" + maxName);
        System.out.println("Max Age:" + maxAge);*/


    }

    public static Animal getOldestAnimal(Animal[] zoo) {
        int maxAgeIndex = 0;
        for (int j = 1; j < zoo.length; j++) {
            Animal maxAgeAnimal = zoo[maxAgeIndex];
            Animal current = zoo[j];
            if (current.age > maxAgeAnimal.age) {
                maxAgeIndex = j;
            }
        }
        Animal oldestAnimal = zoo[maxAgeIndex];
        System.out.println("Max Name:" + oldestAnimal.name);
        System.out.println("Max Age:" + oldestAnimal.age);
        return oldestAnimal;
    }


    public static void myMeth() {
        System.out.println("Hello from My meth");

    }
}
