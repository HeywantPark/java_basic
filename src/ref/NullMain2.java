package ref;

public class NullMain2 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        System.out.println("bd.data = " + bd.data);
        System.out.println("bd.count = " + bd.count);
        //NullPointerException
        System.out.println("bd.data.value = " + bd.data.value);

    }
}
