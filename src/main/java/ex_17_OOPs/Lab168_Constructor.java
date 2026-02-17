package ex_17_OOPs;

public class Lab168_Constructor {
    public static void main(String[] args) {
        Animal dog = new Animal(); // it will call the default constructor of the Animal class
        MySQL a = new MySQL(); // it will call the default constructor of the A class
        ReadExcelFile readExcelFile = new ReadExcelFile(); // it will call the default constructor of the ReadExcelFile class
    }
}
    class MySQL {
        MySQL(){
                System.out.println("MySQL Connected!");
        }
    }

class ReadExcelFile {
    ReadExcelFile(){
        System.out.println("ExcelFile is loaded!");
    }
}