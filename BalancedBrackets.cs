using System;
using System.Collections.Generic;

class BalancedBrackets
{
    public static string isBalanced(string s)
    {
        if (string.IsNullOrEmpty(s))
            return "YES";

        var brackets = new Stack<char>();

        foreach (char c in s)
        {
            if (c is '(' or '[' or '{')
            {
                brackets.Push(c);
            }
            else if (c is ')' or ']' or '}')
            {
                if (brackets.Count == 0)
                    return "NO";

                char opening = brackets.Pop();

                bool isMatch = (c, opening) switch
                {
                    (')', '(') => true,
                    (']', '[') => true,
                    ('}', '{') => true,
                    _ => false
                };

                if (!isMatch)
                    return "NO";
            }
        }

        return brackets.Count == 0 ? "YES" : "NO";
    }
}