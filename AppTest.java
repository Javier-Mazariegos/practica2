import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    
    @Test
    public void test() {
        Double expectednumer = 0.0;
        assertEquals(expectednumer, App.debitoGrande());
        expectednumer = 0.0;
        assertEquals(expectednumer, App.totalDebitos());
        expectednumer = 0.0;
        assertEquals(expectednumer, App.totalCreditos());
        expectednumer = 0.0;
        assertEquals(expectednumer, App.saldo());
    }

}
    