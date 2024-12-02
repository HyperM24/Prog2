using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FizzBuzz
{
    internal class Fizzbuzz
    {

        private int limit;

        public Fizzbuzz(int limit)
        {
            this.limit = limit;
        }

        public void Start()
        {
            for (int i = 0; i < limit; i++)
            {
                if (i % 3 == 0 && i % 5 == 0)
                {
                    Console.WriteLine("fizzbuzz");
                }
                else if (i % 3 == 0)
                {
                    Console.WriteLine("fizz");
                }
                else if (i % 5 == 0)
                {
                    Console.WriteLine("buzz");
                }
                else
                {
                    Console.WriteLine(i);
                }

            }
        }

    }
}
