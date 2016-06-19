import java.io.IOException;

enum Enum1 {
    V1, V2(20), V3(30);

    static int val2;
    int val;

    Enum1(int a) {
        val = a + 10;
    }

    Enum1() {
        val = 10;
    }

    public void inc() {
        val++;
        val2++;
    }


    public String toString() {
        return val + val2 + "";
    }
}

class First {
    static protected int h = 2;
    static           int d = 0, e = 1;
    public    String f = "";
    protected int    g = 2;
    private int a, b, c;

    First() {
        d++;
        h++;
    }

    @Override
    public String toString() {
        return (h + d + e + "");
    }

    public void testFunc() throws IOException {
        try {
            int a = b / 0;
            System.out.println("1");
            throw new IOException();
        } catch (IOException ex) {
            System.out.println(this);
        } finally {
            System.out.println(this.getClass());
        }
    }

    class Fifth {
        private String a = "";

        public Fifth() {
            e++;
        }

        public void testFunc() {
            try {
                First.this.testFunc();
                System.out.println("5");
            } catch (IOException ex) {
                System.out.println(this);
            } finally {
                System.out.println(this.getClass());
            }
        }

        public String toString() {
            return First.this + a + d + h;
        }


    }
}

class Second extends First {
    int b;

    Second() {
        this(3);
        d++;
    }

    Second(int a) {
        h--;
    }

    public String toString() {
        return f + b + e;
    }

    public void testFunc() throws IOException {
        try {
            super.testFunc();
            System.out.println("2");
        } catch (ArithmeticException ex) {
            System.out.println(this);
        } finally {
            System.out.println(this.getClass());
        }
    }
}

class Third extends Second {
    int f;

    Third() {
        super(4);
        e++;
    }

    public String toString() {
        return f + g + "";
    }

    public void testFunc() {
        try {
            super.testFunc();
            System.out.println("3");
        } catch (Exception ex) {
            System.out.println(this);
        } finally {
            System.out.println(this.getClass());
        }
    }
}

class Fourth extends First {
    int d;

    Fourth() {
        g++;
        d++;
    }

    public String toString() {
        return f + g + "";
    }

    public void testFunc() {
        try {
            super.testFunc();
            System.out.println("4");
        } catch (Exception ex) {
            System.out.println(this);
        } finally {
            System.out.println(this.getClass());
        }
    }
}

public class ExamSample1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        First a = new First();
        System.out.println(a);

        First b = new Second();
        System.out.println(b);

        First c = new Fourth();
        System.out.println(c);

        Second d = new Second();
        System.out.println(d);

        Third e = new Third();
        System.out.println(e);

        Fourth f = new Fourth();
        System.out.println(f);

        First.Fifth g = a.new Fifth();
        System.out.println(g);

        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
        System.out.println(d.getClass());
        System.out.println(f.getClass());
        System.out.println(g.getClass());

        Enum1 w = Enum1.V1, x = Enum1.values()[1], y = Enum1.V2, z = Enum1.V3;
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        w.inc();
        x = Enum1.V3;
        y.inc();
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Class cls = new Second[0].getClass();
        System.out.println(cls);

        print(d);
        print(e);

        try {
            a.testFunc();
            b.testFunc();
            c.testFunc();
            d.testFunc();
            e.testFunc();
            f.testFunc();
            g.testFunc();
            System.out.println("Finish!");
        } catch (Exception ex) {
            System.out.println("Main");
        } finally {
            System.out.println("Done.");
        }
    }

    public static void print(Second s) {
        System.out.println(s);
    }
}