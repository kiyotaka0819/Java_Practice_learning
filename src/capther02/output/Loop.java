/**
 * Javaの繰り返し処理（for文・while文）についての解説用クラス
 */
public class Loop {
    public static void main(String[] args) {
        // 1. 基本の for文（回数が決まっているループ）
        // 構文: for (初期化式; 条件式; 変化式) { 繰り返す処理 }
        System.out.println("=== 1から3までカウントアップ ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("現在のカウント: " + i);
        }

        // 2. 偶数だけをピックアップする for文
        System.out.println("\n=== 1から5までの偶数 ===");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " は偶数です");
            }
        }

        // 3. while文（条件を満たしている間ずっと繰り返すループ）
        System.out.println("\n=== while文によるカウントダウン ===");
        int countdown = 3;
        while (countdown >= 0) {
            System.out.println("残り: " + countdown);
            countdown--; // カウントを1減らす（これを忘れると無限ループになるので注意！）
        }
    }
}