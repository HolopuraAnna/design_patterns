public class MultiplicationStrategy implements Strategy {
    @Override
    public int operation(int a, int b) {
        int res = a * b;
        System.out.printf("%s * %s = %s%n", a, b, res);
        return res;
    }
}
