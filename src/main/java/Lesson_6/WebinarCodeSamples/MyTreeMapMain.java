package Lesson_6.WebinarCodeSamples;

public class MyTreeMapMain {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap();
        myTreeMap.put(5,"Five");
        myTreeMap.put(1, "One");
        myTreeMap.put(3, "Three");
        myTreeMap.put(4, "Four");
        myTreeMap.put(5, "Five");
        myTreeMap.put(7, "Seven");
        myTreeMap.put(6,"Six");

        System.out.println(myTreeMap.get(3));
        myTreeMap.put(3, "New Value of Three");
        System.out.println(myTreeMap.get(3));
        myTreeMap.remove(3);
        System.out.println(myTreeMap.toString());
        System.out.println(myTreeMap.size());
        System.out.println(myTreeMap.getDepth());
    }
}
