public class Main
{
    public static void main(String[] args) {
        StaticTest TestA = new StaticTest("a");
        System.out.println(TestA.getNumInstances());
        StaticTest TestB = new StaticTest("b");
        System.out.println(TestB.getNumInstances());

    }
}
