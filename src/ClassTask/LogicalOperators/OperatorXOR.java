package ClassTask.LogicalOperators;

public class OperatorXOR {
    public static void main(String[] args) {

                           // true ^ true
        System.out.println(5 > 4 ^ 6 > 5);

                           // false ^ true
        System.out.println(5 < 4 ^ 6 > 5);

                           // false ^ false
        System.out.println(5 < 4 ^ 6 < 5);

                           // true ^ false
        System.out.println(5 > 4 ^ 6 < 5);

    }
}
