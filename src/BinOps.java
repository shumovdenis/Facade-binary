public class BinOps {
    public String sum(String a, String b) {
        int value1 = Integer.parseInt(a,2);
        int value2 = Integer.parseInt(b,2);
        int sum = value1 + value2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int value1 = Integer.parseInt(a,2);
        int value2 = Integer.parseInt(b,2);
        int sum = value1 * value2;
        String result = Integer.toBinaryString(sum);
        return result;
    }
}
