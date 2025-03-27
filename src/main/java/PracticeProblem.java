public class PracticeProblem {

	public static void bubbleSortString(String[] strings) {
        int n = strings.length;
		boolean swapped = true;
        for (int i = 0; i < n - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
 // WATER BUCKET RELEASE AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH CHICKEN JOCKEY
}
