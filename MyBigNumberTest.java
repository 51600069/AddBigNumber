import org.junit.Test;
import static org.junit.Assert.*;


public class MyBigNumberTest {

    @Test
    public void testSum() {
        MyBigNumber a = new MyBigNumber();
        String sum1 = a.sum("123", "123");
        assertEquals("Correct", "246", sum1);
    }

    @Test
    public void testSum2() {
        MyBigNumber a = new MyBigNumber();
        String sum2 = a.sum("123", "abc");
        assertEquals("Correct", "Vui lòng không nhập chữ hoặc ký tự đặt biệt !", sum2);
    }

    @Test
    public void testSum3() {
        MyBigNumber a = new MyBigNumber();
        String sum3 = a.sum("-123", "123");
        assertEquals("Correct", "Phần mềm chưa hỗ trợ số âm !", sum3);
    }

    
}