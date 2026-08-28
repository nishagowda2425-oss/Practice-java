import java.util.*;
public class suitcase {


    static String[] items = {"Shoes", "Jeans", "T-Shirt", "Laptop", "Book"};
    static int[] weights = {2, 3, 1, 5, 2};  
    static int limit = 7;  

    public static void main(String[] args) {
        List<String> chosen = new ArrayList<>();
        backtrack(0, 0, chosen);
    }

    
    static void backtrack(int index, int currentWeight, List<String> chosen) {
        
        if (currentWeight <= limit) {
            System.out.println("Packed: " + chosen + " | Weight: " + currentWeight);
        }

        
        if (index == items.length) return;

        
        chosen.add(items[index]);
        backtrack(index + 1, currentWeight + weights[index], chosen);

        
        chosen.remove(chosen.size() - 1);
        backtrack(index + 1, currentWeight, chosen);
    }
}