package static2;

public class DecoUtilMain {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil decoUtil = new DecoUtil();
        String deco = decoUtil.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
