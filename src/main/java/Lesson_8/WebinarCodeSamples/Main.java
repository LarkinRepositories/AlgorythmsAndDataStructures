package Lesson_8.WebinarCodeSamples;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(12, "twelwe");
        map.put(15, "fiftheen");

        System.out.println(map);
        map.remove(12);
        System.out.println(map);
    }
}
