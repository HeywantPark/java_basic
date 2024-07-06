package static1;

public class CountMain2 {

    public static void main(String[] args) {
        Date2 data1 = new Date2("a");
        System.out.println("a : " + Date2.count);

        Date2 data2 = new Date2("b");
        System.out.println("b : " + Date2.count);

        Date2 data3 = new Date2("c");
        System.out.println("c : " + Date2.count);


    }
}
