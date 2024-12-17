public class StockProfit {
    public static void main(String[] args) {
        int[] prices = {1, 2, 9, 8, 6};
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else {
                int profit = price - minPrice;
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
