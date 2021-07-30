public class Node{
   int data;
   Node next;
   
   public Node(){

      next=null;
   }
   
   public Node(int num){
      data = num;
      next = null;
   }
   public Node(int num, Node node){
      data = num;
      next = node;
   }
   
   public int getData(){
      return data;
   }
   
   public Node getNext(){
      return next;
   }
   
   public void setData(int num){
      data = num;
   }
   
   public void setNext(Node node){
      next = node;
   }
      
   }
   
