using System;
using System.Linq;

class Program
{
    static void Main()
    {
        // 1. feladat
        var words = new[] { "auto", "villamos", "metro" };
        var result1 = words.Select(word => word.ToUpper() + "!").ToList();
        Console.WriteLine(string.Join(", ", result1));

        // 2. feladat
        var names = new[] { "aladar", "bela", "cecil" };
        var result2 = names.Select(name => Char.ToUpper(name[0]) + name.Substring(1)).ToList();
        Console.WriteLine(string.Join(", ", result2));

        // 3. feladat
        var zeros = Enumerable.Repeat(0, 10).ToList();
        Console.WriteLine(string.Join(", ", zeros));

        // 4. feladat
        var numbers = new[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var result4 = numbers.Select(n => n * 2).ToList();
        Console.WriteLine(string.Join(", ", result4));

        // 5. feladat
        var strings = new[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        var result5 = strings.Select(s => int.Parse(s)).ToList();
        Console.WriteLine(string.Join(", ", result5));

        // 6. feladat
        string s = "1234567";
        var result6 = s.Select(c => int.Parse(c.ToString())).ToList();
        Console.WriteLine(string.Join(", ", result6));

        // 7. feladat
        string sentence = "The quick brown fox jumps over the lazy dog";
        var result7 = sentence.Split().Select(word => word.Length).ToList();
        Console.WriteLine(string.Join(", ", result7));

        // 8. feladat
        sentence = "python is an awesome language";
        var result8 = sentence.Split().Select(word => word[0]).ToList();
        Console.WriteLine(string.Join(", ", result8));

        // 9. feladat
        sentence = "The quick brown fox jumps over the lazy dog";
        var result9 = sentence.Split().Select(word => Tuple.Create(word, word.Length)).ToList();
        foreach (var tuple in result9)
        {
            Console.WriteLine($"({tuple.Item1}, {tuple.Item2})");
        }

        // 10. feladat
        var evenNumbers = Enumerable.Range(0, 10).Where(n => n % 2 == 0).ToList();
        Console.WriteLine(string.Join(", ", evenNumbers));

        // 11. feladat
        var squares = Enumerable.Range(0, 20).Select(n => n * n).Where(sq => sq % 2 == 0).ToList();
        Console.WriteLine(string.Join(", ", squares));

        // 12. feladat
        var squaresEndingIn4 = Enumerable.Range(0, 20).Select(n => n * n).Where(sq => sq % 10 == 4).ToList();
        Console.WriteLine(string.Join(", ", squaresEndingIn4));

        // 13. feladat
        var alphabet = Enumerable.Range(65, 26).Select(i => (char)i).ToList();
        string result13 = string.Concat(alphabet);
        Console.WriteLine(result13);

        // 14. feladat
        var wordsWithSpaces = new[] { " apple ", " banana ", " kiwi" };
        var result14 = wordsWithSpaces.Select(word => word.Trim()).ToList();
        Console.WriteLine(string.Join(", ", result14));

        // 15. feladat
        var binaryList = new[] { 1, 0, 1, 1, 0, 1, 0, 0 };
        string result15 = string.Concat(binaryList.Select(digit => digit.ToString()));
        Console.WriteLine(result15);
    }
}
