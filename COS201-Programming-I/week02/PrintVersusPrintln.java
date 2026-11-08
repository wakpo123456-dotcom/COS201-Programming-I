public class PrintVersusPrintln {
    public static void main(String[] args) {
        // print() leaves the cursor on the same line
        System.out.print("COS ");
        System.out.print("201");
        System.out.print(" | ");

        // println() ends the line after printing
        System.out.println("Java");
        System.out.println("Second line");

        // \n and \t are escape sequences inside a string
        System.out.print("Line A\nLine B\tTabbed\n");
    }
}
