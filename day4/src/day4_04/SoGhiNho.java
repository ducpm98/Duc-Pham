package day4_04;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;


public class SoGhiNho 
{
    
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       HashMap<String, Integer> map = new HashMap<>();
        map.put("Joy", 34543);
        map.put("Jack", 56765);
        map.put("Tina", 34567);
        
        System.out.println("Name\tNumber");
        
        for (Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+"\t"+ entry.getValue());
            
        }    
        
        //Tim xem so 3443 co trong so cua ban hay khong
        if(map.containsValue("3443")){
            System.out.println("Da ton tai so 3443");
        }else{
            System.out.println("Khong ton tai so 3443");
        }
       
        //Tim xem tin cua Jack con ton tai hay khong
        if(map.containsKey("Jack"))
        {
            System.out.println("Con ton tin nhan cua Jack");
        }else{
            System.out.println("Khong con ton tai tin nhan cua Jack");
        }
        
        //Tim so cua tina
       for (Entry<String, Integer> entry : map.entrySet())
        {
          if( entry.getKey().equalsIgnoreCase("tina"))
          {
              System.out.println("Tina's number is: "+ entry.getValue());
          }          
        }
       
       //Xoa Joy
       map.remove("Joy");
       
       //in ra so ghi nho khi xoa joy
       
       System.out.println("Name\tNumber");
        
        for (Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+"\t"+ entry.getValue());
            
        }  
    }
}
