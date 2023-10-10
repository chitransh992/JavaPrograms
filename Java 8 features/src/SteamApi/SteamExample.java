package SteamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamExample{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(20);

        System.out.println("Priniting tthe collection :"+arrayList+"\n");

        List<Integer> ls = arrayList.stream().filter(i->i%2 == 0).collect(Collectors.toList());

        System.out.println("Printing the List after Stream operation :"+ls);
    }
}