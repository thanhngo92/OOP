import java.math.BigDecimal;

public class BigDecimalArray {
    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (BigDecimal num : arr) {
            if (num.compareTo(max) > 0) { 
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BigDecimal[] numbers = {
            new BigDecimal("10.5"),
            new BigDecimal("23.75"),
            new BigDecimal("99.99"),
            new BigDecimal("150.25"),
            new BigDecimal("200.00")
        };

        System.out.println("Max value: " + findMax(numbers));
    }
}
