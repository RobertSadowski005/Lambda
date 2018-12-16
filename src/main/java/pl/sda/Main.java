package pl.sda;

public class Main {
    public static void main(String[] args) {

        interfaceChecker<Integer> isOddAnonymous = new interfaceChecker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };

        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));


        interfaceChecker<Integer> isOddLambda = x -> x%2 !=0;
        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));

    }
}
