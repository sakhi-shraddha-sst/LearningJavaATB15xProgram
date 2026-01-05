package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {

//        int a = 10;
//        System.out.println(++a);


        // POST Increment = Print first and the increment
        int a_post  = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);


//        Exp and Result Table
//        Line No  | a_post |  Result b
//              11 | 10  | NA
//              12 |  11   | 10
//              13 |  11   | a_post
//              14 |     | 10 b

    }
}
