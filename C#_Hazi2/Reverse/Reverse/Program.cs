using System;

class Program
{
    static void Main()
    {
        
        Console.WriteLine(ReverseNumber(1977)); 
        Console.WriteLine(ReverseNumber(12568)); 
    }

    static int ReverseNumber(int number)
    {
        int reversed = 0;

        while (number > 0)
        {
           
            int digit = number % 10;

            
            reversed = reversed * 10 + digit;

            
            number /= 10;
        }

        return reversed;
    }
}
