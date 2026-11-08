public class CommonErrors {
    public static void main(String[] args) {
        // This file compiles. Each comment shows a typical beginner mistake
        // and the compiler message it would produce.

        System.out.println("Learning Java");     // correct

        // System.out.println("Learning Java")   -> error: ';' expected
        // system.out.println("Hi");             -> error: package system does not exist (capital S needed)
        // System.out.println("Hi);              -> error: unclosed string literal
        // public class commonerrors {...}       -> error: class name must match the file name
        // int x = "text";                       -> error: incompatible types

        System.out.println("Read the first error message first; it is usually the real problem.");
    }
}
