package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {


        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);


        // hasCode
        System.out.println("hasCode('A') = " + hashCode("A"));
        System.out.println("hasCode('B') = " + hashCode("B"));
        System.out.println("hasCode('AB') = " + hashCode("AB"));
        // hasCode('A') = 65
        // hasCode('B') = 66
        // hasCode('AB') = 131


        // hasIndex
        int hashCode = hashCode("A");
        int hashIndex = hashIndex(hashCode);
        System.out.println("hashIndex = " + hashIndex);


        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
        // hashIndex(A) = 5
        // hashIndex(B) = 6
        // hashIndex(AB) = 1


    }


    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray){
            sum = sum + (int)c;
        }
        return sum;
    }


    static int hashIndex(int value){
        return value % CAPACITY;
    }

}
