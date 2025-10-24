//declare person class
class Person{
    String name;
    int age;
    void callme1(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
//access person class data
class Teacher extends Person{
    String qualification;
    void callme2(){
        callme1(); //access person class data
        System.out.println("Qualification: "+ qualification);
    }
}
public class Main {
public static void main(String[] args){
    Teacher t1= new Teacher ();
    t1.name="Noyon Hossain";
    t1.age=22;
    t1.qualification="Bsc In CSE";
    t1.callme2(); ////access person class data
}
}
