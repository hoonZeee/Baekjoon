import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());
        Map<String, Character> codeMap = new HashMap<>();

        
        for (int i = 0; i < k; i++) {
            String line = sc.nextLine();
            char ch = line.charAt(0);
            String code = line.substring(2); 
            codeMap.put(code, ch);
        }

        
        String binary = sc.nextLine();
        StringBuilder current = new StringBuilder();
        StringBuilder result = new StringBuilder();

       
        for (char c : binary.toCharArray()) {
            current.append(c);
            if (codeMap.containsKey(current.toString())) {
                result.append(codeMap.get(current.toString()));
                current.setLength(0);
            }
        }

        System.out.println(result);
    }
}
