public class Test
{
    public void test() {
        string s = input();
        string s1 = fixSql(s);
        string s2 = s+s1;

        execute(s);
        execute(s1);
        execute(s2); 
    }
}
