using System;

public static class StringExtensions
{
    public static int ToInt(this string s)
    {
      
        return int.Parse(s);
    }
}

class Program
{
    static void Main()
    {
        string s = "42";

        int i = s.ToInt();

        Console.WriteLine(s);    
        Console.WriteLine(i);    
    }
}
