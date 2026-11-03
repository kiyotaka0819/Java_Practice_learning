// コンソールからの入力を受け取るためにインポートが必要
import java.util.Scanner;

/**
 * メソッド（処理のまとめ役）の基礎についての解説用クラス
 */
public class Method_Intro {
    
    // mainメソッド（プログラムが最初にここを動かす）
    public static void main(String[] args) {
        System.out.println("=== メソッドの呼び出しテスト ===");

        // 1. 値を返すだけのシンプルなメソッドを呼ぶ
        sayHello(); // 「こんにちは！」と表示するだけのメソッドを実行

        // 2. 引数（データを渡す）を受け取るメソッドを呼ぶ
        getName("しんのすけ");
        getName("しんちゃん");

        // 3. 計算結果を「返す（return）」メソッドを呼んで、結果を変数で受け取る
        int result = add(10, 20);
        System.out.println("10 と 20 を足した結果: " + result);
    
        // 4. Scannerを使った入力とメソッドの連携
        System.out.println("\n=== ④ Scannerとメソッドの連携 ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの好きなアーティスト（または曲名）を入力してください。: ");
        String userText = scanner.nextLine(); // 入力された文字列を取得
        scanner.close(); // 使い終わったら閉じる
        // 取得した入力値を、メソッドに「引数」として渡して処理してもらう
        showEchoMessage(userText);
    }

    // --- ここから下が自分で作ったメソッドの定義 ---

    // ① 引数なし・戻り値なしのメソッド
    public static void sayHello() {
        System.out.println("こんにちは！Javaの世界へようこそ！");
    }

    // ② 引数（name）を受け取るメソッド
    public static void getName(String name) {
        System.out.println("ようこそ、" + name + "さん！");
    }

    // ③ 計算して結果（int型）を返すメソッド
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // ④ 受け取った文字列を使ってメッセージを組み立てて出力するメソッド
    public static void showEchoMessage(String message) {
        System.out.println("--- メソッド内の処理 ---");
        System.out.println("おお、「" + message + "」！いいですね！");
    }
}
