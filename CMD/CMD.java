class CMD
{
    public static void main(String Arg[])
    {
        System.out.println("Demonstration of CMD");
        int No1 = Integer.parseInt(Arg[0]);
        int No2 = Integer.parseInt(Arg[1]);

        int Ans = No1 + No2;
        System.out.println("Number of Command line arguments : "+Arg.length);
        System.out.println("Addition is : "+Ans);
    }
}