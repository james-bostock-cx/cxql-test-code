class Test
{
    public void foo() {
        String s = input();
        srv.send(s);
    }

    public void bar() {
        String r = srv.recv();
        execute(r);
    }
}
