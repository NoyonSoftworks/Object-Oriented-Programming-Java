class Person{
    String name;
    int age;
    void callme1(){  //method name
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

class Teacher extends Person{
    String qualification;
    void callme1(){ //same method name for overridding
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Qualification:" + qualification);
    }
}
public class Main {
public static void main(String[] args){
    Teacher t1= new Teacher();
    t1.name="Noyon Hossain";
    t1.age=22;
    t1.qualification="Bsc In CSE";
    t1.callme1(); //same method name call to access data
}
}
