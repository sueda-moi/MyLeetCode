import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        List<Integer> profitList = new ArrayList<>();

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profitList.add(prices[i] - prices[i - 1]);
            }
        }

        for (Integer integer : profitList) {
            maxProfit = maxProfit + integer;
        }

        return maxProfit;

    }
}
