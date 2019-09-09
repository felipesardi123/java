package exemplo.cvc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appInstance() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest);
    }
}
