package basic;

public class FreshJuicetest {

    public static  void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("size: " + juice.size);

    }
}
