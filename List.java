public class List{
   Node head;
   Node tail;
   
   public List(){
      head = null;
      tail = null;
   }
   
   public void add(Node n){
      if(head == null){
         head = n;
         tail = n;
      } else{
         tail.setNext(n);
         tail = n;
      }
   }
   
   public void display(){
      Node current = head;
      
      while(current != null){
         System.out.println(current.getData() + " ");
         current = current.getNext();
      }
      System.out.println();
   }
   
   
   public void deleteHead(){
      if(head == null){
         return;
      } else if(head.equals(tail)){
         head = tail = null;
      } else{
         Node n = head.getNext();
         head = n;
      }
   }
   
   public void addMiddle(Node n){
      Node current = head;
      Node temp = current.getNext();
      
      for(int i = 0; i < (this.getLength()/2)-1; i++){
         current = current.getNext();
         temp = temp.getNext();
      }
      current.setNext(n);
      n.setNext(temp);
   }
   
   public int getLength(){
      Node current = head;
      int count = 0;
      
      while(current != null){
         count++;
         current = current.getNext();
      }
      
      return count;
   }
   
   public void searchFor(int data){
      int count = 0;
      Node current = head;
      boolean flag = false;
      
      while(current != null){
         if(current.getData() == data){
            System.out.println("The data has been found at index: " + count);
            flag = true;
         }
         
         count++;
         current = current.getNext();
      }
      if(flag==false){
      System.out.println("The data is not in this list. :(");
      }
   }
   
   public static void main(String[] args){
      Node n1 = new Node(1);
      List l = new List();
      l.add(n1);
      Node n2 = new Node(2);
      l.add(n2);
      l.add(new Node(3));
      l.add(new Node(4));
      l.add(new Node(5));
      l.add(new Node(6));
      l.add(new Node(7));
      l.add(new Node(8));
      l.addMiddle(new Node(10));
      l.display();
      l.searchFor(8);
      l.searchFor(11);
   }
}