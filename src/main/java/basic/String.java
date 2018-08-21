package basic;

public class String {

    public static void main(String[] args) {
        System.out.println("Hello World"); // print Hello World
        Character cha = '\t';

        System.out.println("Tab start \t New Line Start \n Backspace start \b Carriage start \r Feed start \f Insert Single qute \' Insert double quote \" Insert Backspace \\ End.");
        System.out.println("is C is Letter? "  + Character.isLetter('c'));
        System.out.println("Is 6 is Letter? " + Character.isLetter('6'));
        System.out.println("Is Y is Digit: " + Character.isDigit('Y'));
        System.out.println("Is Y is Digit: " + Character.isDigit('9'));
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase('C'));
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.toString('y'));
        System.out.println(Character.toString('Y'));
//        String
    }

}
