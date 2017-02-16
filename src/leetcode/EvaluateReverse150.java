package leetcode;

import java.util.Stack;

public class EvaluateReverse150
{

	public int evalRPN(String[] tokens)
	{
        Stack<Integer> r = new Stack<>();
        for(String s : tokens)
        {
            int a=0,b=0;
            if(s.equals("+"))
            {
                r.push(r.pop()+r.pop());
            }
            else if(s.equals("-"))
            {
                b=r.pop();
                a=r.pop();
                r.push(a-b);
            }
            else if(s.equals("*"))
                r.push(r.pop()*r.pop());
            else if(s.equals("/"))
            {
                b=r.pop();
                a=r.pop();
                r.push(a/b);
            }
            else
            {
                r.push(Integer.parseInt(s));
            }
        }
        return r.pop();
		
	}
}
