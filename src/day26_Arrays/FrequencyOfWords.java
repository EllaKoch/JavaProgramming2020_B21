package day26_Arrays;

public class FrequencyOfWords {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String sentence = "I love Java, java is a cool programming language and " +
                "java is more useful than javascript, python python";

        String[] arr = sentence.split(" ");

        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i].toLowerCase().contains("java")) {
                countJava++;
            }

            if (arr[i].toLowerCase().contains("python")) {
                countPython++;
            }

        }

        System.out.println("Java: " + countJava);
        System.out.println("Python: " + countPython);


    }
}
