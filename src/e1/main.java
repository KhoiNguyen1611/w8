package e1;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("src/e1/user.txt", true));
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("age: ");
        int age = scanner.nextInt();

        pw.println(name + "," + address + "," + age);
        pw.flush();
        pw.close();
    }
}
