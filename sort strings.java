
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"virat","jadeja","messi","anderson","zaka"};
        Arrays.sort(words);

        System.err.println("Sorted strings:");
        for(String word : words){
            System.out.print(word+",");
        }
    }
    
}