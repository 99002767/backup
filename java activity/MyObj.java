class MyObj
{
    int value;
}
public class Main
{
    public static void main(String[] args)
    {
        
        ArrayList<MyObj> al = new ArrayList<MyObj>();

    int a,b;

    for(int i =0;i<5;i++)
    {
        MyObj ob1 = new MyObj();
        ob1.value = i + 5;

        al.add(ob1);

    }
        for(int j=0;j<5;j++)

            System.out.println("value: "+al.get(j).value);
    }
}
