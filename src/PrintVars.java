public class PrintVars {
    public static void main(String[] args) {
        for (int counter = 0; counter < 101; counter++) {
            if (counter % 2 == 0){
                System.out.println(counter);
            }
        }
        String sentence = "This is a sentence";
        char[] splitSent = sentence.toCharArray();
        for (char splitted : splitSent) {
            System.out.println(String.valueOf(splitted));
        }

        int countdown = 20;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Pochivka");
        for (int countA = 0 ; ;){
            if (countA > 10){
                break;
            }
            else {
                System.out.println(countA);
                countA++;
            }
        }
    }
}
