// コンソールからの入力を受け取るために Scanner クラスをインポートする
import java.util.Scanner;

/**
 * キーボード入力を受け付けて変数に格納するサンプルクラス
 */
public class HensuInput {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成（標準入力 System.in から読み込む）
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ユーザー情報を入力してください ===");

        // 1. 文字列の入力 (next())
        System.out.print("あなたの名前を入力してください: ");
        String name = scanner.nextLine(); // スペースを含む行全体を取得

        // 2. 整数の入力 (nextInt())
        System.out.print("あなたの年齢を入力してください: ");
        int age = scanner.nextInt();

        // 3. 浮動小数点数の入力 (nextDouble())
        System.out.print("あなたの身長(cm)を入力してください (例: 170.5): ");
        double height = scanner.nextDouble();

        // 入力ストリームを閉じる（リソースの解放）
        scanner.close();

        // 4. 入力された変数を使って出力
        System.out.println("\n=== 入力結果の確認 ===");
        System.out.println("こんにちは、" + name + "さん！");
        System.out.println("年齢は " + age + "歳 ですね！");
        System.out.println("身長は " + height + "cm ですね！");
    }
}