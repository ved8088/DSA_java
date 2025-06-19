package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }

    }


}


public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();

        map.put("Ved", 121112);
        map.put("Atharva", 1212312);
        map.put("Kini", 312121);

//        System.out.println(map.containsKey("Ved"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(69);

        System.out.println(set);

    }
}
