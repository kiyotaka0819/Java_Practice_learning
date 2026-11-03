/**
 * 条件分岐の応用（switch文）についての解説用クラス
 */
public class Switch {
    public static void main(String[] args) {
        int rank = 2; // 1: 金, 2: 銀, 3: 銅

        // 1. 基本の switch文
        // 変数の値（今回は rank）に応じて処理を分岐させる
        System.out.println("=== switch文による順位判定 ===");
        switch (rank) {
            case 1:
                System.out.println("金メダル！おめでとう！");
                break; // ここで処理を抜け出す（ブレイクを書き忘れると次のケースも実行されちゃうので注意！）
            case 2:
                System.out.println("銀メダル！すごい！");
                break;
            case 3:
                System.out.println("銅メダル！がんばった！");
                break;
            default: // どの case も当てはまらなかったときの処理（if文の else みたいなやつ）
                System.out.println("入賞外！次頑張ろう！");
                break;
        }

        // 2. 文字列を使った switch文（曜日やコマンドの判定でよく使う）
        String day = "水曜日";
        System.out.println("\n=== 曜日別の予定 ===");
        switch (day) {
            case "月曜日":
            case "火曜日":
                System.out.println("仕事・開発の日！");
                break;
            case "水曜日":
                System.out.println("ギターの練習をする日！");
                break;
            default:
                System.out.println("のんびり過ごす日！");
                break;
        }
    }
}