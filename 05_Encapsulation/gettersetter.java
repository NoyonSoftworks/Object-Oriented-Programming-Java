class Person{
    private String name;
    private int age;
   //getter
   public String getName(){
        return name;
    }
  //setter
    public void setName(String name) {
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age= age;
    }
}
class Teacher extends Person{
    private String qualification;
    
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification= qualification;
    }
    
    void displayinformation(){
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Qualification: "+ getQualification());
    }
}
public class Main {
    public static void main(String[] args){
        Teacher t1= new Teacher();
        t1.setName("Noyon Hossain");
        t1.setAge(22);
        t1.setQualification("Bsc In CSE");
        t1.displayinformation();//display data accesss
    }
}
