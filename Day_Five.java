public class Day_Five{
   public static void main(String[] args){
      String s = "i love cats 1000 @";
      //s = replace(s);
      //System.out.println(s);
      
      double[] arr = percentages(s);
      System.out.println("digits: " + arr[0] + " lower case: " + arr[2] + " upper case: " 
       + arr[1] + " others: " + arr[3]);
   }
   
   public static String replace(String s){
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == ' '){
            s = s.replace(" ", "");
         }
      }
      return s;
   }
   
   public static double[] percentages(String s){
      double[] percentages = new double[4];
      int numDigit = 0; int numUp = 0; int numLow = 0; int other = 0;
      for(int i = 0; i<s.length(); i++){
         if(Character.isDigit(s.charAt(i))){
            numDigit++;
         } else if(Character.isLowerCase(s.charAt(i))){  
            numLow++;
         } else if(Character.isUpperCase(s.charAt(i))){
            numUp++;
         } else {
            other++;
         }
      }
      
      double a = (double)numDigit/s.length();
      double b = (double)numUp/s.length();
      double c = (double)numLow/s.length();
      double d = (double)other/s.length();
      
      
      a*=100;
      b*=100;
      c*=100;
      d*=100;
      
      a = Math.round(a*100.0)/100.0;
      b= Math.round(b*100.0)/100.0;
      c=Math.round(c*100.0)/100.0;
      d=Math.round(d*100.0)/100.0;
      
      percentages[0] = a;
      percentages[1] = b;
      percentages[2] = c;
      percentages[3] = d;
      
      
      return percentages;

      
      
      
   }
}