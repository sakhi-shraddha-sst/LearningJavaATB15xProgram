package ex_06_Ternary_Operators;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {


        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int maximum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.println("MAX OUT OF THREE : " + maximum);


        int cli_n1 = Integer.parseInt(args[0]);
        int cli_n2 = Integer.parseInt(args[1]);
        int cli_n3 = Integer.parseInt(args[2]);

        int cli_maximum = (cli_n1 > cli_n2) ? ((cli_n1 > cli_n3) ? cli_n1 : cli_n3) : ((cli_n2 > cli_n3) ? cli_n2 : cli_n3);

        System.out.println(cli_n1);
        System.out.println(cli_n2);
        System.out.println(cli_n3);

        System.out.println("CLI - MAX OUT OF THREE : " + cli_maximum);
    }

}
