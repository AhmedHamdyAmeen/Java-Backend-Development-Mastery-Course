package PS.hackerrank;

import java.util.Scanner;

/**
 * URL: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
 * Requirements: scan some integer inputs from stdin (stander input) and output them again to stdout (stander output).
 */
public class PS2javaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(scan.nextInt());
//            int a = scan.nextInt();
//            System.out.println(a);
        }
        
        // Way #: One
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
}
