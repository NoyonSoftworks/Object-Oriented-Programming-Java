public class MultilevelInheritance {
    public static void main(String[] args) {
        //declare person class
        class Person {
            String name;
            int age;

            void callme1() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        }

        //access person class data
        class Teacher extends Person {
            String qualification;

            void callme2() {
                callme1(); //access person class data
                System.out.println("Qualification: " + qualification);
            }
        }

        //access teacher class data
        class Student extends Teacher {
            String major;

            void callme3() {
                callme2(); //access teacher class data
                System.out.println("Major: " + major);
            }
        }

        Student s1 = new Student();
        s1.name = "Noyon Hossain";
        s1.age = 22;
        s1.qualification = "Bsc In CSE";
        s1.major = "Computer Science";
        s1.callme3(); //access student class data
    }
}
