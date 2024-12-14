import java.util.*;
class a
{
    public void pl()
    {
        System.out.println("HEllo Students");
    }
}
class b extends a{
    public void r()
    {
        System.out.println("Hello Teachers");
    }
}
class c extends b{
    public void r1()
    {
        System.out.println("Hello professors");
    }
}
class main{
    public static void main(String args[])
    {
        c f=new c();
        f.pl();
        f.r();
        f.r1();
    }
}
