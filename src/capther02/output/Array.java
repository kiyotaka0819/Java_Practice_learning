/**
 * Javaの配列（複数のデータをまとめて管理する箱）についての解説用クラス
 */
public class Array {
    public static void main(String[] args) {
        // 1. 配列の宣言と初期化（データをまとめて入れる）
        // 型[] 変数名 = { 値1, 値2, 値3, ... };
        int[] scores = {80, 65, 90, 75, 95};

        // 2. 配列の要素へのアクセス（インデックスは 0 から始まる！）
        System.out.println("=== 配列の要素の取得 ===");
        System.out.println("1人目の点数: " + scores[0] + "点"); // 0番目 = 80
        System.out.println("3人目の点数: " + scores[2] + "点"); // 2番目 = 90

        // 配列の要素数を取得する (.length)
        System.out.println("人数（要素数）: " + scores.length + "人");

        // 3. 通常の for文を使った配列の全件表示
        System.out.println("\n=== 全員の点数（for文） ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "人目: " + scores[i] + "点");
        }

        // 4. 拡張 for文（for-each文）を使った全件表示
        // 書くだけで上から順番に要素を取り出せるのでスッキリ書ける
        System.out.println("\n=== 全員の点数（拡張for文） ===");
        for (int score : scores) {
            System.out.println("スコア: " + score + "点");
        }

        // 5. 配列を使った合計点と平均点の計算
        int total = 0;
        for (int score : scores) {
            total += score; // 合計に足していく
        }
        double average = (double) total / scores.length;

        System.out.println("\n=== 集計結果 ===");
        System.out.println("合計点: " + total + "点");
        System.out.println("平均点: " + average + "点");
    }
}