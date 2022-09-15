package esphere.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

public class CorrectPassword {
    @Test
    void CorrectPassword0() {
        Scanner scanner = new Scanner(System.in);
        int password_1 = scanner.nextInt();
        Assertions.assertEquals(new Random().nextInt(), password_1);
    }
}
