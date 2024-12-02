using static System.Console;

namespace Homework
{
    class Sztringek2
    {
        // E. verbing
        private static string Verbing(string s)
        {
            if (s.Length >= 3)
            {
                if (s.EndsWith("ing"))
                {
                    return s + "ly";  
                }
                else
                {
                    return s + "ing";  
                }
            }
            return s;  
        }

        // F. not_bad
        private static string NotBad(string s)
        {
            int notIndex = s.IndexOf("not");
            int badIndex = s.IndexOf("bad");

           
            if (notIndex != -1 && badIndex != -1 && badIndex > notIndex)
            {
                return s.Substring(0, notIndex) + "good" + s.Substring(badIndex + 3);  
            }

            return s;  
        }

        // G. front_back
        private static string FrontBack(string a, string b)
        {
          
            int midA = (a.Length + 1) / 2;  
            string frontA = a.Substring(0, midA);
            string backA = a.Substring(midA);

           
            int midB = (b.Length + 1) / 2;
            string frontB = b.Substring(0, midB);
            string backB = b.Substring(midB);

            return frontA + frontB + backA + backB;
        }

        private static void Test(string got, string expected)
        {
            var prefix = (got == expected ? " OK " : "  X ");
            WriteLine($"{prefix} got: {got}; expected: {expected}");
        }

        public static void Main(string[] args)
        {
            WriteLine("verbing");
            Test(Verbing("hail"), "hailing");
            Test(Verbing("swiming"), "swimingly");
            Test(Verbing("do"), "do");

            WriteLine();
            WriteLine("not_bad");
            Test(NotBad("This movie is not so bad"), "This movie is good");
            Test(NotBad("This dinner is not that bad!"), "This dinner is good!");
            Test(NotBad("This tea is not hot"), "This tea is not hot");
            Test(NotBad("It's bad yet not"), "It's bad yet not");

            WriteLine();
            WriteLine("front_back");
            Test(FrontBack("abcd", "xy"), "abxcdy");
            Test(FrontBack("abcde", "xyz"), "abcxydez");
            Test(FrontBack("Kitten", "Donut"), "KitDontenut");
        }
    }
}
