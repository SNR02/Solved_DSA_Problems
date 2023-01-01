// Problem Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

// Using Stack (My fav problem)

class Solution {
    //Use a stack to store every digit numbers.
    //Whenever we detect a binary operation (Must be), we pop the top two elements in stack.
    //Then calculate and put result back to stack.
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(tokens[i].equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else
                stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.pop();
    }
}
