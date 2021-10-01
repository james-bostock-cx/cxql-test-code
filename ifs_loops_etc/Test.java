public class Test
{
    public void test(int i) {
        try {
            if (i < 0) {
                action1();
            } else {
                action2();
            }

            for (int n = 0; n < i; n++) {
                action3();
            }

            int j = i < 0 ? 0 : i;
        } finally {
            action4();
        }
    }
}
