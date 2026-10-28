// コンソールからの入力を受け取るために Scanner クラスをインポートする
import java.util.Scanner;

/**
 * キーボード入力と if文による条件分岐を組み合わせたサンプルクラス
 */
public class HensuIf {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成（標準入力 System.in から読み込む）
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ユーザー情報を入力してください ===");

        // 1. 文字列の入力
        System.out.print("あなたの名前を入力してください: ");
        String name = scanner.nextLine(); 

        // 2. 整数の入力
        System.out.print("あなたの年齢を入力してください: ");
        int age = scanner.nextInt();

        // 3. 浮動小数点数の入力
        System.out.print("あなたの身長(cm)を入力してください (例: 170.5): ");
        double height = scanner.nextDouble();

        // 入力ストリームを閉じる
        scanner.close();

        // 4. 入力された変数を使って出力 ＆ if文で条件分岐
        System.out.println("\n=== 診断結果 ===");
        System.out.println("こんにちは、" + name + "さん！");

        // 年齢に応じた条件分岐 (if / else if / else)
        if (age < 20) {
            System.out.println("年齢は " + age + "歳 ですね！青春をエンジョイしてください！");
        } else if (age >= 20 && age < 60) {
            System.out.println("年齢は " + age + "歳 ですね！働き盛りですね！");
        } else {
            System.out.println("年齢は " + age + "歳 ですね！第二の人生をお楽しみください！");
        }

        // 身長に応じた条件分岐
        if (height >= 170.0) {
            System.out.println("身長も " + height + "cm 超えていて高身長ですね！");
        } else {
            System.out.println("身長は " + height + "cm ですね！小柄で可愛らしいですね！");
        }
    }
}