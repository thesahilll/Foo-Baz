package com.sahil.basics;

public class variables {
    // this is a class level variable
    // this is shared across all instances of the class
    private static String staticVariable = "staticVariable";

    // instance variable is shared for all methods
    private String instanceVariable = "instanceVariable";

    public void testLocalVariable(String input)
    {
        // local variables are accessible only in the method
        String localVariable = " local variable ";
        System.out.println("*********");
        System.out.println(" The value of localVariable is "+ localVariable);
        System.out.println("********* \n");
        localVariable = input;
        System.out.println("*********");
        System.out.println(" The value of localVariable is "+ localVariable);
        System.out.println("********* \n");
    }
    public void testInstanceVariable(String input)
    {
        System.out.println("*********");
        System.out.println(" The value of instanceVariable is "+ instanceVariable);
        System.out.println("********* \n");
        instanceVariable = input;
        System.out.println("*********");
        System.out.println(" The value of instanceVariable is "+ instanceVariable);
        System.out.println("********* \n");
    }

    public void testInstanceVariableScope()
    {
        System.out.println("*********");
        System.out.println(" The value of instanceVariable inside testInstanceVariableScope is "+ instanceVariable);
        System.out.println("********* \n");
    }

    public static void testStaticVariable(String input)
    {
        System.out.println("*********");
        System.out.println(" The value of staticVariable is "+ staticVariable);
        System.out.println("********* \n");

    }

    public static String getStaticVariable()
    {
        return staticVariable;
    }

    public static void setStaticVariable(String staticVariable)
    {
        variables.staticVariable = staticVariable;
    }

    public String getInstanceVariable()
    {
        return instanceVariable;
    }

    public void setInstanceVariable(String instanceVariable)
    {
        this.instanceVariable = instanceVariable;
    }
}
