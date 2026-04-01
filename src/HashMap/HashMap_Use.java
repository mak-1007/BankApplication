package HashMap;

import java.util.HashMap;

public class HashMap_Use {
    public static void main(String args[]){
        HashMap <String,Integer> map =new HashMap<>();

//        add
        map.put("amaan",22);
        map.put("ayan",20);
//        access
        System.out.println("check access : "+map.get("amaan"));
        System.out.println("check access : "+map.get("ayan"));
//        contraint
        System.out.println("check contraint : "+map.containsKey("amaan"));
//        size
        System.out.println("check size : "+map.size());
//       delete
        map.remove("amaan");
//        again check all keys
        System.out.println("check remove"+map.containsKey("amaan"));




    }
}
