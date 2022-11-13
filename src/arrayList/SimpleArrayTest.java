package arrayList;

public class SimpleArrayTest {
    public static void main(String[] args) {
        SimpleArray<String> strings = new SimpleArrayImpl<>();
        strings.add("sanya");
        strings.add("lexa");
        strings.add("dimon");
        strings.add("nastya");

        System.out.println(strings.get(0));
        System.out.println(strings.size());

        strings.update(0,"san sanuch");
        System.out.println(strings.get(0));

        strings.delete(1);
        System.out.println(strings.get(1));

        System.out.println();
        for (String s: strings){
            System.out.println(s);
        }

    }
}
