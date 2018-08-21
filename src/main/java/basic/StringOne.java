package basic;

public class StringOne {

    public static void main(String[] args) {

        String string1 = "String 1 ";
        String string2 = "String 2";
        String string3 = string1.concat(string2);

        System.out.println(string3);

        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1);

        System.out.println(Str2);

        String Str3 = Str2.copyValueOf(Str1, 0, 5);
        System.out.println(Str3);

        String Str = new String("This world is round!!");

        boolean retVal;

        retVal = Str.endsWith("round!!");
        System.out.println("String is ending with round!!: " + retVal);

        retVal = Str.endsWith("world");
        System.out.println("String is ending with world: " + retVal);

        retVal = Str.endsWith("!");
        System.out.println("String is ending with !: " + retVal);

        String Str4 = string1.replace('1', '4');

        System.out.println(Str4);

        String str5 = "World-is-round-and-large-and-with-water.";

        System.out.println("Return value: ");

        for(String retVal1: str5.split("-", 7)){
            System.out.println(retVal1);
        }

        String str6 = "test for substring";
        System.out.println(str6.substring(0, 1));

        String str7 = "Small case to upperCase";
        System.out.println(str7.toUpperCase());

        double d = 102.939;
        System.out.println("Return Value : " + String.valueOf(d) );

        String str8 = "                     White space should be trimmed from start and ending if trim will be used.           ";
        System.out.println(str8);
        System.out.println(str8.trim());
        System.out.println(str7.concat(" " + str8.trim()));

    }
}
