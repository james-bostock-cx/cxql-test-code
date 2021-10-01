package test;

class Test extends Base
{
    int a = 1;

    int foo(Foo foo, Bar bar) {
        int a = foo.process();
        int b = bar.process();
        int c = bar(b);
        return a + b + c;
    }

    int bar(int i) {
        int n = randomInt();
        return i * n;
    }
}
