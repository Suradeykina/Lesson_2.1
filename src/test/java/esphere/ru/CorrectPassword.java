package esphere.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

public class CorrectPassword {
    @Test
    void CorrectPassword0() {
        Scanner scanner = new Scanner(System.in);
        int password_2 = 63355;
        Assertions.assertNotEquals(6332556, password_2);
    }
}
