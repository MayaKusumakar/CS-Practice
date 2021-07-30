import java.util.*;
public class Day_Two{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
      /* for(int i = 1; i <= 5; i++){
          System.out.println(i);
       }

          
     System.out.println("what is the bigger note?");
     int bn = scan.nextInt();
     
     System.out.println("what is the smaller note?");
     int sn = scan.nextInt();
     
     int num = bn/sn;
     for(int i = 1; i<num+1; i++){
         System.out.println("$" + sn + " bill number " + i + ". Total = $" + sn*i);

     }
     
     int[] array = {3,4,5,-5,0,12};
     int sum = 0;
     
     for(int ele : array){
         sum += ele;
     }
     
     System.out.println(sum);
     
     System.out.println("how large is your array?");
     int size = scan.nextInt();
     int[] arr = new int[size];
     
     System.out.println("enter the elements of the array");
     for(int i = 0; i<size; i++){
         arr[i] = scan.nextInt();
     }
     //int[] arr = {3,4,5,-5,0,12};
     
     int oddsum = 0; int evensum = 0;
     for(int i : arr){
         if(i%2==0){
            evensum += i;
         } else {
            oddsum+= i;
         }
     }
     
     System.out.println("odd sum: " + oddsum + "\n" + "even sum: " + evensum);
     
     
     
     for(int i = 0; i <6;i++){
         for(int j = 6-i; j >0; j--){
            System.out.print(" ");
         }
         
         for(int m = 0; m <= i; m++){
            System.out.print("* ");
         }
         System.out.println();
     }     
     
     
     for(int i = 0; i < 9;i++){
      for(int j = 1; j<i; j++){
         System.out.print(j);
      }
      System.out.println();
     }
     
     
     ArrayList<String> al = new ArrayList<String>();
     
     al.add("a");
     al.add("e");
     al.add("i");
     al.add("o");
     al.add("u");
     
     System.out.println("enter a string: ");
     String str = scan.nextLine();
     
     int count = 0;
     
     for(int i = 0; i < str.length(); i++){
      String letter = str.charAt(i) + "";
      if(al.contains(letter)){
         count++;
      }
     }
     System.out.println("number of vowels: " + count);
     
     
     System.out.println("first number: ");
     int fn = scan.nextInt();
     System.out.println("second number: ");
     int sn = scan.nextInt();
     
     for(int i = fn; i<=sn;i++){
         for(int j = 1; j <= 10; j++){
            System.out.println(i + "*" + j + "=" + i*j);
         }
         System.out.println(".  .");
     }
     
     
     System.out.println("enter a number: ");
     int num = scan.nextInt();
     int og = num;
     
     int reverse = 0;
     
     while(num != 0){
      int digit = num%10;
      reverse = reverse*10+ digit;
      num/=10;
     }
     
     //System.out.println(reverse);
     
     if(reverse == og){
      System.out.println("this number is a palindrome");
      
     } else{
      System.out.println("this number is not a palindrome");
     }
        
     
        System.out.println("enter ur number: ");
        int num = scan.nextInt();
        System.out.println(factorial(num));
        
      
        System.out.println("enter ur number: ");
        int num = scan.nextInt();
        System.out.println("perfect square: " + perfectSquare(num));
        
        */
        
        int[] arr = {7,11,5,4,20,13,2};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(average(arr));
        System.out.println(linearSearch(arr,11));
        System.out.println(binarySearch(arr,11));
        selectionSort(arr);
        for(int i : arr){
         System.out.print(i + " ");
        }   
          }
     public static void insertionSort(int[] arr){
      for (int i = 1; i < arr.length-1;i++) {
            int key = arr[i];
            int j = i-1;
            
            while (j>=0 && arr[j] > key){
               arr[j+1] = arr[j];
               j--;
            }
            key = arr[j+1];
     }
     }
     public static void selectionSort(int[] arr){
         for (int i = 0; i < arr.length-1; i++){
            int min = i;
               for(int j = i+1; j < arr.length; j++){
                  if(arr[min]>arr[j]){
                     min = j;
                  }
               }
               
               int temp = arr[i];
               arr[i] = arr[min];
               arr[min] = temp;
         }
     }
     
     public static int binarySearch(int[] arr, int n){
         int l = 1;
         int r = arr.length; 
         while(r>=l){
            
            int midpoint = l+(r-l)/2;
            
            if(arr[midpoint]==n){
               return midpoint;
            }
            
            if(n<arr[midpoint]){
               r = midpoint-1;
            }
            
            if(n>arr[midpoint]){
               l = midpoint +1;
            }
         }
         
         return -1;
     }
     public static boolean perfectSquare(int n){
      for (int i = 1; i * i <= n; i++) {
            if(n%i==0){
               if(n/i==i){
                  return true;
               }
            } 
           
        }
        return false;
     }
     public static int factorial(int n){
         int total = 1;
         for(int i = n; i >0; i--){
            total *= i;
         }
         
         return total;
     }
     
     public static int max(int[] array){
      int max = array[0];
      
      for(int i : array){
         if(i>max){
            max = i;
         }
      }
      return max;
     }
     
     public static int min(int[] array){
      int min = array[0];
      
      for(int i : array){
         if(i<min){
            min = i;
         }
      }
      return min;
     }
     
     public static int average(int[] array){
      int sum = 0;
      int count = 0;
      
      for(int i : array){
         sum+=i;
         count++;
      }
      return sum/count;
     }
     
     public static int linearSearch(int[] array, int n){
         int count = 0;
         
         for(int i : array){
            count++;
            if(i == n){
               return count;
            }
            
         }
         
         return -1;
     }
 
}