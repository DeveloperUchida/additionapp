import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scannerを使ってユーザーから入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // 最初の数を入力
        System.out.print("最初の数を入力してください: ");
        int num1 = scanner.nextInt();

        // 二番目の数を入力
        System.out.print("二番目の数を入力してください: ");
        int num2 = scanner.nextInt();

        // 足し算を実行
        int sum = num1 + num2;

        // 結果を表示
        System.out.println("結果: " + sum);

        // Scannerを閉じる
        scanner.close();
    }
}
