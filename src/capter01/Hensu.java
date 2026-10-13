package capter01;

/**
 * Javaの変数についての解説用クラス
 */
public class Hensu { // ファイル名とクラス名を合わせる
    public static void main(String[] args) {
        // 1. 変数の宣言と代入（基本）
        // 型 変数名 = 値; の形で書く
        // 整数型（int）
        int age = 25; 
         // 浮動小数点数型（double）
        double height = 170.5;
        // 真偽値型（boolean: true または false）
        boolean isStudent = true; 
        // 文字型（char: 1文字をシングルクォーテーションで囲む）
        char grade = 'A';
        // 文字列型（String: クラス型、ダブルクォーテーションで囲む）
        String name = "太郎"; 

        // 2. 変数の値を出力してみる
        System.out.println("--- 基本的な変数の値 ---");
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        System.out.println("学生ですか？: " + isStudent);
        System.out.println("評価: " + grade);

        // 3. 変数の値は書き換えられる（再代入）
        age = 26; // 25から26に書き換え
        System.out.println("\n--- 値を書き換えた後 ---");
        System.out.println("来年の年齢: " + age + "歳");

        // 4. 定数（一度入れたら変更できない変数）
        // 「final」をつけると、後から値を変更できなくなる
        final double TAX_RATE = 0.10;
        System.out.println("\n--- 定数の例 ---");
        System.out.println("消費税率: " + (TAX_RATE * 100) + "%");
        
        // TAX_RATE = 0.08; // ← ここで書き換えようとするとコンパイルエラーになる
    }
}