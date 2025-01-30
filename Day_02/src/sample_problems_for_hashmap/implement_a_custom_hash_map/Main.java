package sample_problems_for_hashmap.implement_a_custom_hash_map;

public class Main {
    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(102, 200);
        hashMap.put(3, 30);

        System.out.println("Get key 2: " + hashMap.get(2));
        System.out.println("Get key 102: " + hashMap.get(102));

        hashMap.remove(2);
        System.out.println("Get key 2 after removal: " + hashMap.get(2));

        hashMap.display();
    }
}
