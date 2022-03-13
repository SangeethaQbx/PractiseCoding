import java.util.ArrayList;
import java.util.HashMap;

public class LargestPalindrome {


    public static boolean isPalindrome(String str) {
       StringBuilder sb=new StringBuilder("");
     for(int i=str.length()-1;i>=0;i--){
        sb.append(str.charAt(i));
     }if(sb.toString().equals(str)){
         return true;
        } else return false;
    }

    public static void main(String[] args) {
        String str="theehtquickbrownfoxxofnworbquickkciuq";
        System.out.println(LargestPalindrome.isPalindrome(str));
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> max=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
            boolean pali= isPalindrome(str.substring(map.get(str.charAt(i)),i+1));
                if(pali==true){
                    max.add(str.substring(map.get(str.charAt(i)),i+1));
                }
            }else map.put(str.charAt(i),i);
        }
        String maxi=max.get(0);
        for (String s:max) {
            if(s.length()>maxi.length()){
                maxi=s;
            }
        }
        System.out.println(maxi);
    }
}
