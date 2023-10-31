package javaproject1;
import java.util.ArrayList;
public class Collections{
	 public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.add("carrom");
list.add("football");
list.add("chess");
String games = list.get(1);
for (String item : list) {
    System.out.println(item);
}
}
}