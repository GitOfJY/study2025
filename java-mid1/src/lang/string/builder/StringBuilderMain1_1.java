package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = "+sb);
        // sb = ABCD

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);
        // insert = ABCDJava

        sb.delete(4, 8);
        System.out.println("delete = " + sb);
        // delete = ABCD

        sb.reverse();
        System.out.println("reverse = " + sb);
        // reverse = DCBA

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println(string);
        // DCBA

    }
}
