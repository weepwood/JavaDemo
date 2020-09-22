package c3;

/**
 * @author lanqilu
 * @date Created in 2020/09/22  19:59
 * @description 杨辉三角
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        final int MAX = 10;

        // 创建三角数组
        int[][] odds = new int[MAX + 1][];
        for (int n = 0; n <= MAX; n++) {
            odds[n] = new int[n + 1];
        }

        // 填充数组
        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                int lotteryOdds = 1;
                for (int k = 1; k <= j; k++) {
                    lotteryOdds = lotteryOdds * (i - k + 1) / k;
                }
                odds[i][j] = lotteryOdds;
            }
        }
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
