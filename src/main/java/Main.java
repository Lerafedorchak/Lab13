import Group;

public class Main {
    public static void main(String[] args) {
        Group<Integer> nestedGroup = new Group<>();
        Signature<Integer> s1 = new Signature<>(System.out::println);
        Signature<Integer> s2 = new Signature<>(x -> System.out.println(x * x));
        nestedGroup.addTask(s1).addTask(s2);
        Group<Integer> group = new Group<>();
        Signature<Integer> s3 = new Signature<>(x -> System.out.println(x * x * x));
        group.addTask(nestedGroup).addTask(new Signature<>(x -> System.out.println(x * x * x)));
        group.apply(10);
    }
}
