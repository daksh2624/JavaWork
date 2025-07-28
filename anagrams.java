import com.sun.source.tree.ArrayAccessTree;
import java.util.*;
public class anagrams {

    public static boolean anagrams(String str,String str2){
        str =str.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        
        if(str.length() != str2.length()){
            return false;
        }
            char[] charArray1 = str.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
        }

        public static boolean wihoutSort(String str, String str2){
            int freq[] = new int[26];
            for(int i = 0 ; i < str.length() ; i++){
                freq[str.charAt(i) - 'a']++;
            }
            for(int i = 0 ; i < str.length() ; i++){
                freq[str2.charAt(i) - 'a']--;
            }
            for(int i = 0 ; i < freq.length ; i++){
                if(freq[i] !=0){
                    return false;
                }
            }return true;
        }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        if (anagrams(str,str2) ){
            System.out.println(str + " and " + str2 + " are anagrams.");
         } else {
            System.out.println(str + " and " + str2 + " are not anagrams.");
        }

    }

}

