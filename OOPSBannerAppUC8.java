import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        renderBanner("OOPS", patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                String[] pattern = patternMap.get(ch);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}