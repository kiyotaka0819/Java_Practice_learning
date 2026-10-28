package lesson;

import java.util.Scanner;

/**
 * キーボード入力と if文(条件分岐) の組み合わせ練習問題
 */
public class HensuIf_Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ユーザー情報を入力してください ===");

        System.out.print("あなたの名前を入力してください: ");
        String name = scanner.nextLine();

        System.out.print("あなたの年齢を入力してください: ");
        int age = scanner.nextInt();

        System.out.print("あなたの身長(cm)を入力してください: ");
        double height = scanner.nextDouble();

        scanner.close();

        System.out.println("\n=== 診断結果 ===");
        System.out.println("こんにちは、" + name + "さん！");

        // TODO 1: 変数 age の値に応じて、以下の条件分岐を作成してください
        // ・20歳未満の場合 : "年齢は ○歳 ですね！青春をエンジョイしてください！"
        // ・20歳以上 60歳未満の場合 : "年齢は ○歳 ですね！働き盛りですね！"
        // ・それ以外 (60歳以上) : "年齢は ○歳 ですね！第二の人生をお楽しみください！"


        // TODO 2: 変数 height の値に応じて、以下の条件分岐を作成してください
        // ・170.0cm 以上の場合 : "身長も ○cm 超えていて高身長ですね！"
        // ・170.0cm 未満の場合 : "身長は ○cm ですね！小柄で可愛らしいですね！"

    }
}