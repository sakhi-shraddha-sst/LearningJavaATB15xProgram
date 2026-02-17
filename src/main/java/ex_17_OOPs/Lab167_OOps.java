package ex_17_OOPs;

public class Lab167_OOps {
    public static void main(String[] args) {

//        Person p1;  // p1 . object reference variable
        Person p1 = new Person();  // new Person() -> Object
        p1.name = "Sam";

        Person p2 = new Person();  // new Person() -> Object
        p1.name = "Tom";

        Person p3; // null reference variable

        new Person(); // object is created in heap area but there is no object reference > Object without reference variable

    }
}
