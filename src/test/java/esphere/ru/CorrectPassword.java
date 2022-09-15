package esphere.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorrectPassword {
    @Test
    void CorrectPassword0() {
        int password = 96632;
        Assertions.assertNotEquals(1889, password);
    }
}
