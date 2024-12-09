using System;
using System.Linq;

class Program
{
    static void Main()
    {
        int sum = Enumerable.Range(1, 999)
                            .Where(n => n % 3 == 0 || n % 5 == 0) 
                            .Sum(); 

        Console.WriteLine("A 1000-nél kisebb számok összege, melyek 3-nak vagy 5-nek a többszörösei: " + sum);
    }
}
