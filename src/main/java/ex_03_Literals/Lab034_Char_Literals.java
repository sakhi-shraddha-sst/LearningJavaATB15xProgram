package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {

        char c1 = 'A';
        // A to Z, a to z, 0 to 9, special characters !@##$$%^&**(

//        char c = "A"; // Compilation Error
        // String in "" - bunch of characters

        char c2 = 'B';
        System.out.println(c2);

        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // escaspe sequences
        char new_line = '\n'; // new line
        char tab = '\t'; // tab
        char backspace = '\b'; // backspace
        char carriage_return = '\r'; // carriage return
        char double_quote = '\"'; // double quote
        char single_quote = '\''; // single quote
        char backslash = '\\'; // backslash


        System.out.println("SakhiMali");
        System.out.println("Sakhi" + new_line + "Mali");
        System.out.println("Sakhi\nMali");
        System.out.println("Sakhi" + tab + "Mali");
        System.out.println("Sakhi" + backspace + "Mali");

        System.out.println("______________________");

        System.out.println("Hi. This is a first " + new_line + "This is second line." + new_line + "This is third line.\n");

        char ruppee = '₹';
        System.out.println("Ruppee Symbol: " + ruppee);

        char my_laugh_smiley = '\u263A';
        System.out.println("My Laugh: " + my_laugh_smiley);


        long amount = 1_000_000L;
        System.out.println("Amount: " + amount);

    }
}
