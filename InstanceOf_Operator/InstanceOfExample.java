class Animal{
    
}
class person extends Animal{
    
}
class Teacher extends person{
    
}

public class Main {
public static void main(String[] args){
    Animal a= new Animal();
    person p= new person();
    Teacher t= new Teacher();
    
    System.out.println(a instanceof Animal);
    System.out.println(p instanceof Animal);
    System.out.println(t instanceof person);
    System.out.println(t instanceof Animal);
    System.out.println(p instanceof Teacher);
}
}
