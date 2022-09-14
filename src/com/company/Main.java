package com.company;

import static ibio.Helpers.input;
import static ibio.Helpers.inputInt;

public class Main
{

    public static void main(String[] args)
    {
        boolean RUNNING = true;
        while (RUNNING)
        {
            String OPERATION = input("give operation: ");
            if (OPERATION.equals("end"))
            {
                RUNNING = false;
            }
            else
            {
                int A = inputInt("give first integer operand: ");
                int B = inputInt("give first integer operand: ");
                if (OPERATION.equals("add"))
                {
                    System.out.println(A + B);
                }
                if (OPERATION.equals("sub"))
                {
                    System.out.println(A - B);
                }
                else
                {
                    System.out.println("unknown operation");
                }
            }
        }
    }
}
