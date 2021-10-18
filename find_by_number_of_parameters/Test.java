public class test
{
    public Test() {
    }

    public Test(String s) {
    }

    public Test(int x, int y) {
    }

    public void foo() {
    }

    public void bar(String s) {
    }

    public void baz(int x, int y) {
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test("(1, 5)");
        Test t3 = new test(1, 5);

        t1.foo();
        t2.bar("(5, 1)");
        t3.baz(5, 1);
    }
}
