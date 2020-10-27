import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
  
public class Main {
  
  public static void main(String[] args) {
  
    ArrayList arrayList = new ArrayList();
    arrayList.add("aaa");

    arrayList.add("bbb");

    arrayList.add("ccc");
    arrayList.add("ddd");
    arrayList.add("eee");
    System.out.println("Elements in ArrayList prior sorting :");


    for(int i=0; i < arrayList.size(); i++)
 
System.out.println(arrayList.get(i));

    Comparator comparator = Collections.reverseOrder();


  
    Collections.sort(arrayList,comparator);


 
    System.out.println("Elements in ArrayList after sorting :");
    for(int i=0; i < arrayList.size(); i++)



 
System.out.println(arrayList.get(i));
  
  }
}