package lesson;
import java.util.Scanner;

/**
 * Scanner を使用した標準入力の練習問題
 */
public class HensuInput_Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ユーザー情報を入力してください ===");

        // TODO 1: コンソールから名前(String)を入力させて変数 name に代入してください
        // メッセージ表示例: "あなたの名前を入力してください: "

        // TODO 2: コンソールから年齢(int)を入力させて変数 age に代入してください
        // メッセージ表示例: "あなたの年齢を入力してください: "

        // TODO 3: コンソールから身長(double)を入力させて変数 height に代入してください
        // メッセージ表示例: "あなたの身長(cm)を入力してください: "

        // リソースの解放（あらかじめ書いておきます）
        scanner.close();

        // TODO 4: 入力された内容を以下のように画面に出力してください
        // 出力例:
        // こんにちは、太郎さん！
        // 年齢は 25歳 ですね！
        // 身長は 170.5cm ですね！

    }
}