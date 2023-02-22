package my_practices.advanced_practice.practice13;

import java.util.*;

public class Aile {


    private Map<String, String> nameSurname = new HashMap<>();

    private List<String> bros = new ArrayList<>();

    private Map<Integer, List<String>> ageBro = new HashMap<>();

    private HashMap <Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();

    public Aile(String name,String surname, Integer age, String... bros) {
        this.nameSurname.put(name,surname);
        this.bros.addAll(Arrays.asList(bros));
        this.ageBro.put(age,this.bros);
        this.aileMap.put(this.nameSurname,this.ageBro);
    }

    public HashMap<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }

    @Override
    public String toString() {
        return aileMap.toString();
    }
}
