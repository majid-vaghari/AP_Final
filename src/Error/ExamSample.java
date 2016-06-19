package Error;

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
        this(0);
        d++;
        h++;
    }

    private First(int a) {
        d += a;
    }

    @Override
    public String toString() {
        return (h + d + e + "");
    }

    public void testFunc() throws IOException {

    }

    static class Sixth {
        private String a = "";

        public Sixth() {
//            g++;
        }

//        @Override
        public void testFunc() {
//            System.out.println(g);
            System.out.println(a);
//            System.out.println(b);
        }

        public String toString() {
            return /*First.this +*/ a /*+ b*/ + h;
        }


    }

    class Fifth {
        private String a = "";

        public Fifth() {
            super(/*2*/);
            e++;
        }

//        @Override
        public void testFunc() {
            System.out.println(g);
            System.out.println(a);
            System.out.println(b);
        }

        public String toString() {
            return First.this + a + b + h;
        }


    }

    private class Seventh {
        private String a = "";

        public Seventh() {
            g++;
        }

//        @Override
        public void testFunc() {
            System.out.println(g);
            System.out.println(a);
            System.out.println(b);
        }

        public String toString() {
            return First.this + a + b + h;
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
        super(/*2*/);
        h--;
    }

//    String toString() {
//        return f + b + e;
//    }

    @Override
    public void testFunc(/*int b*/) throws IOException {

    }
}

class Third extends Second {
    int f;

    Third() {
        super(4);
        e++;
        b++;
    }

    public String toString() {
        return f + g + "" /*+ a*/;
    }

    @Override
    public void testFunc() {
    }
}

class Fourth extends First {
    int d;

    Fourth() {
        g++;
        d++;
//        c++;
    }

    public void testFunc(int c) {
    }
}

public class ExamSample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        First         a = new First(/*15*/), b = new Second(), c = new Fourth();
        Second        d = new Second();
        Third         e = new Third();
        Fourth        f = new Fourth();
        First.Fifth   g = a.new Fifth();
        First.Sixth   h = /*a.*/new First.Sixth();
//        First.Seventh i = a.new Seventh();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);

        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
        System.out.println(d.getClass());
        System.out.println(f.getClass());
        System.out.println(g.getClass());

        Enum1 w = Enum1.V1, x = Enum1.values()[1], y = Enum1.V2/*(5)*/, z = Enum1.V3;
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        w.inc();
        x = Enum1.V3;
        y.inc();
        x.val++;
        y.val2++;

        Class cls = new Second[0].getClass();
        System.out.println(cls);

//        cls h = cls.newInstance();
        cls = Second.class;
//        d = new cls();
//        d = cls.newInstance();

//        print(b);
        print(d);
        print(e);
    }

    public static void print(Second s) {
        System.out.println(s);
    }
}
