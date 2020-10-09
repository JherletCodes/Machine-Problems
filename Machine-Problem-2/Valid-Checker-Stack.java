import java.util.*;
public class MP4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your Stack: ");
        int sizeOfStack = input.nextInt();
        //displays the user input for number of stack and stored in sizeOfStack
        Stack<String> stack = new Stack();
        while (sizeOfStack > 30)
        {
            System.out.println("Invalid Input! Your size of the stack should be less than or equal to 30: ");
            System.out.println("Please try again.");
            sizeOfStack = input.nextInt();
        }
        //a boolean type valid is declared 
        boolean valid = false;
        //a boolean type balanced is declared 
        boolean balanced = false;
        while (!valid)
        {//for the valid boolean a while loop is used 
            valid = true;
            if (valid)
            {//valid is already set as true in the condition
                for (int i = 0; i < sizeOfStack; i++)
                {//a for loop in order to check how many times the sizeOfStack will be executed
                    System.out.print("Enter an expression: ");
                    String expression = input.next();
                    //An expression must be entered by the user
                    boolean valid2  = false;
                    //a valid2 boolean is declared
                    if (expression.matches("[-+*/]")) 
                    {//this condition is used to validate the -, +, *, / operators
                        valid2 = true;
                    }
                    if(expression.matches("[({\\[\\]})]")) 
                    {//this condition is used to validate the parenthesis
                        if(expression == ")") 
                        {
                            stack.pop();
                            if (expression == "{" || expression == "[")
                            {
                                balanced = true;
                            }
                        }
                        if(expression == "}")
                        {
                            stack.pop();
                            if (expression == "(" || expression == "[")
                            {
                                balanced = true;
                            }
                        }
                        if(expression == "]")
                        {
                            stack.pop();
                            if (expression == "(" || expression == "{")
                                {
                                balanced = false;
                            }
                        }
                        valid2 = true;
                    }
                    if (expression.matches("[-a-zA-Z]"))
                    {//this is used to validate all single letters (a-z/A-Z)
                        valid2 = true;
                    }
                    if (expression.matches("[0-9]"))
                    {//this is used to validate all single digits (0-9)
                        valid2 = true;
                    }
                    if (valid2)
                    {
                        stack.push(expression);
                        //the stack will be pushed once valid2 gets equal to true
                    }
                    else
                    {
                        System.out.println("You've entered an invalid input");
                        System.exit(0);
                        //exits 
                    }
                }
                if (!balanced)
                {
                    System.out.println("The expression is balanced");
                }
                if (balanced)
                {
                    System.out.println("The expression is not balanced");
                }
                System.out.println("Final Stack: " + stack);
                //output for the final stack will be printed
            }
            else
            {
                System.out.println("Sorry you have entered an invalid input.");
                System.exit(0);
                //exits from the whole program
            }
        }
    }
}
