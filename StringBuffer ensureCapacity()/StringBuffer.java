import java.lang.*;
public class Capacity {
   public static void main(String[] args) {

      StringBuffer sb = new StringBuffer("Hello");
      System.out.println("The string is: " + sb);

      System.out.println("The old capacity of string is: " + sb.capacity());

      int minimumCapacity = 15;

      sb.ensureCapacity(minimumCapacity);
      System.out.println("The new capacity is: " + sb.capacity());
   }
}