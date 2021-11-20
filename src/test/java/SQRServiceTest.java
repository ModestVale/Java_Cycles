import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.*;
import org.junit.jupiter.params.ParameterizedTest;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "200,300,3",
                    "100,200,5",
                    "100,300,8",
                    "200,500,8",
                    "2000,5000,26"
            },
            delimiter = ','
    )
    public void Test(int left, int right, int expected)
    {
        SQRService service = new SQRService();
        int result = service.calculateSqrCount(left,right);
        assertEquals(expected,result);
    }
}
