import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;

class getAdd {
    public static int add(int a, int b) {
        return a+b;
    }
}
public class junitdemoTest {
    @Test
    public void getTest() {
        Calculation c=new Calculation();
        int arr[]=new int[]{1,4,2,3};
        assertEquals(4, c.findMax(arr));
        int arr2[]=new int[]{-1,-4,-2,-3};
        assertEquals(-1, c.findMax(arr2));
    }
    @AfterEach
    public void getNext() {
        System.out.println("Going to next test...");
    }
    @Test
    public void addTest() {
        assertEquals(8,getAdd.add(5, 3),"5+3=8");
    }

}