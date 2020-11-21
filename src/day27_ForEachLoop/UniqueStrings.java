package day27_ForEachLoop;

public class UniqueStrings {
    public static void main(String[] args) {
        String[] arr = {"C#", "C#", "Java", "Python","Python","C++" };

        for(int j = 0; j < arr.length; j++){

            String element = arr[j];//"C#" under index 0
            int frequency = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals(element)){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element+" ");
            }

        }







    }
}
