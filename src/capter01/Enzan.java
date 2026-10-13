package capter01;

/**
 * Javaの四則演算や型の注意点についての解説用クラス
 */
public class Enzan {
    public static void main(String[] args) {
        // 1. 基本の四則演算
        int a = 10;
        int b = 3;

        System.out.println("=== 基本の四則演算 ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("足し算 (a + b) = " + (a + b)); // 13
        System.out.println("引き算 (a - b) = " + (a - b)); // 7
        System.out.println("掛け算 (a * b) = " + (a * b)); // 30
        
        // ⚠️ 超重要！整数同士の割り算
        System.out.println("割り算・商 (a / b) = " + (a / b)); // 3 （小数点以下は切り捨てられる）
        System.out.println("割り算・余り (a % b) = " + (a % b)); // 1 （余りを求める、べき算）

        // 小数点まで正確に計算したいときは double 型を使う
        double exactResult = (double) a / b;
        System.out.println("正確な割り算 (doubleに変換) = " + exactResult); // 3.3333...

        // 2. 文字列と数値の足し算（連結の罠）
        System.out.println("\n=== 文字列と数値の足し算 ===");
        System.out.println("年齢は " + 20 + "歳 です。"); // 文字列と結合されて "年齢は 20歳 です。" になる
        System.out.println(10 + 20 + " は合計です。"); // 前半は数値の足し算になって "30 は合計です。" になる
        System.out.println("合計は " + 10 + 20 + " です。"); // ⚠️ "合計は 1020 です。" になってしまう！（左から順に処理されるため）
        System.out.println("正しい合計は " + (10 + 20) + " です。"); // カッコで囲むと先に計算される

        // 3. インクリメント・デクリメント（前置と後置の違い）
        System.out.println("\n=== インクリメントの前置と後置 ===");
                
        // --- 後置（i++）の例 ---
        a = 5;
        System.out.println("初期値 a: " + a);
        // a++ は「今の値（5）を使ってから、aを6にする」
        System.out.println("a++ を出力中: " + (a++)); // 5 が出力される
        System.out.println("出力したあとの a: " + a);     // ここで 6 になっている

        System.out.println("-------------------");

        // --- 前置（++i）の例 ---
        b = 5;
        System.out.println("初期値 b: " + b);
        // ++b は「先に b を 6 に増やしてから、その値を使う」
        System.out.println("++b を出力中: " + (++b)); // 6 が出力される
        System.out.println("出力したあとの b: " + b);     // 6 のまま
    }
}  