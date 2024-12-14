class a
{
    public void r()
    {
        System.out.println("Hello");
    }
}
class b extends a {
    public void r1(){
    super.r();
    System.out.println("Hello teachers");
}
}
 class main{
    public static void main(String args[])
    {
        b n=new b();
        n.r1();
    }
}