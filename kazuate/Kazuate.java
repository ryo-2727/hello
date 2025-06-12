import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        int answer = 47; // プログラマが決めた数（2桁）
        int maxTries = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを始めます！2桁の数字を当ててください。");

        for (int i = 1; i <= maxTries; i++) {
            System.out.print(i + "回目の予想: ");
            int guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("当たり！");
                return;
            }

            int diff = Math.abs(answer - guess);
            if (diff >= 20) {
                System.out.println("20以上離れています！");
            } else if (guess < answer) {
                System.out.println("もっと大きいです。");
            } else {
                System.out.println("もっと小さいです。");
            }
        }

        System.out.println("残念！正解は " + answer + " でした。");
        scanner.close();
    }
}
