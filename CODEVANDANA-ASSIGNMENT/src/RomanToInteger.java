import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String arga[]){
      String romanNumeral = "IX";
      int result = 0;
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('v',5);
        romanMap.put('X',10);

        for(int i = 0; i<romanNumeral.length(); i++){
            int current = romanMap.get(romanNumeral.charAt(i));
            int next=(i+1 < romanNumeral.length())?romanMap.get(romanNumeral.charAt(i+1)):0;

            if(current>=next){
                result+=current;
            }else {result-=current;
        }
    }
        System.out.println(result);
}}
