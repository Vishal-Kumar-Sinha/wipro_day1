import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junitdemoTest {
    @Test
    public void getTest() {
        Calculation c=new Calculation();
        int arr[]=new int[]{1,4,2,3};
        assertEquals(4, c.findMax(arr));
        int arr2[]=new int[]{-1,-4,-2,-3};
        assertEquals(-1, c.findMax(arr2));
    }
}