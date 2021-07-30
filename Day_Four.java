import java.io.*;
import java.util.*;
public class Day_Four{
   public static void main(String[] args){
      System.out.println(anagram("keep", "peeker"));
      System.out.println(duplicates("big black bug bit a big black dog on his big black nose"));
      
      int[] array = numVowels("hi my name is nemo");
      
      System.out.println("num vowels: " + array[0] + " num concsenents: " + array[1]);
      System.out.println(changeCase("hElLo"));
      
   }
   
   public static boolean anagram(String a, String b){
      if(a.length() != b.length()){
         return false;
      } 
      
      char[] ch = a.toCharArray();
      char[] ch2 = b.toCharArray();
      
      Arrays.sort(ch);
      Arrays.sort(ch2);
      
      for(int i = 0; i < ch.length; i++){
         if(ch[i] != ch2[i]){
            return false;
         }
      }
      
      return true;
      
         }
         
     public static ArrayList<String> duplicates(String s){
         char[] ch = s.toCharArray();
         ArrayList<String> al = new ArrayList<String>();
         
         Map<String, Integer> map = new HashMap<String, Integer>();
         for(int i = 0; i < ch.length; i++){
            String word = "";
            while(ch[i] != ' ' && i<ch.length-1){
            word+="" + ch[i];
            i++;
            }
            if(map.containsKey(word)){
               if(!(al.contains(word))){
                  al.add(word);
               }
            }
            else{
               map.put(word,1);
            }
                  
            
         }
         
         return al;
     }
     
     public static int[] numVowels(String s){
         int[] array = new int[2];
         ArrayList<Character> al = new ArrayList<Character>();
         al.add('a');
         al.add('e');
         al.add('i');
         al.add('o');
         al.add('u');
         
         int numVowels = 0;
         int numConscenets = 0;
         for(int i = 0; i < s.length(); i++){
            if(al.contains(s.charAt(i))){
               numVowels++;
            } else if(!(s.charAt(i) == ' ')){
               numConscenets++;
            }
         }
         
         array[0] = numVowels;
         array[1] = numConscenets;
         
         return array;
     }
     
     public static String changeCase(String str){
     
         String newstr = "";
         for(int i = 0; i < str.length(); i++) {       
            if(Character.isLowerCase(str.charAt(i))) {       
                String s = str.charAt(i) + "";
                String s2 = s.toUpperCase(); 
                newstr+=s2;   
            }        
            else if(Character.isUpperCase(str.charAt(i))) {    
                String a = str.charAt(i)+"";
                String a2 = a.toLowerCase();
                newstr+=a2;
     }
     }
     return newstr;
     }
}