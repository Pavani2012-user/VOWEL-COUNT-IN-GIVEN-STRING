public class Vowelcount {
     public static void main(String[] args) {
            String inputString = "Hello, World!";
            int vowelCount = 0;
            String vowels = "aeiouAEIOU";
    
            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                }
            }
    
            System.out.println("Number of vowels: " + vowelCount);
        }
    }
    

