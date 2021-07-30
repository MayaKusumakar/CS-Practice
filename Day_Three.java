import java.util.*;
import java.io.*;
public class Day_Three{
   public static void main(String[] args){
   
      int[][] ar = {{3,4,5},{6,7,8},{1,2,3}};
      int[][] arr2 = {{1,2,3},{6,7,8},{3,4,5}};
      /*
      System.out.println(Arrays.deepToString(add(ar,b)));
      int[] a = countOdd(ar);
      System.out.println("Even: " + a[0] + " Odd: " + a[1]);
      
      transpose(ar);
      System.out.println(Arrays.deepToString(ar));
      
      
      String s = "the best of both worlds";
      System.out.println(length(s));
      
      
      String s = "fun";
      System.out.println(combos(s));
      
      
      
      String s = "Dream big";
      System.out.println(reverse(s));
      
      */
      
      String a = "abcde";
      String b = "deabc";
      System.out.println(rotation(a,b));
   }
   
   public static int[][] add(int[][]a, int[][]b){
      int[][] c = new int[a.length][a[0].length];
      for(int i = 0; i < a.length; i++){
         for(int j = 0; j <a[i].length;j++){
            c[i][j] = a[i][j]+b[i][j];
         }
      }
      
      return c;
   }
   
   public static int[] countOdd(int[][]a){
      int evenCount = 0;
      int oddCount = 0;
      int[] values = new int[2];
      for(int i = 0; i < a.length; i++){
         for(int j = 0; j <a[i].length;j++){
            if(a[i][j]%2==0){
               evenCount++;
            }else{
               oddCount++;
            }
      }
      
      values[0] = evenCount;
      values[1] = oddCount;
      }
      return values;
   
}

   public static void transpose(int[][] a){
      for (int i = 0; i < a[0].length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = temp;
         }
      }
   }
   
   public static int length(String s){
      int count = 0;
      for(int i = 0; i < s.length(); i++){
         if(!(s.charAt(i) == ' ')){
            count++;
         }
         
      }
      return count;
   }
   
   public static ArrayList<String> combos(String s){
      ArrayList<String> al = new ArrayList<String>();
      
      for(int i = 0; i < s.length(); i++){
         String str = "" + s.charAt(i);
         al.add(str);
         for(int j = i+1; j<s.length(); j++){
            str += "" + s.charAt(j);
            al.add(str);
            
         }
      }
      return al;
   }
   
   public static String reverse(String s){
   
   String str = "";
   for(int n = s.length()-1; n>=0;n--){
      str = str + "" + s.charAt(n);
   }
   return str;
      
   }
   
   
   public static boolean rotation(String a, String b){
      String s = a + "" + a;
      if(s.contains(b)){
         return true;
      }
      return false;
   }
}