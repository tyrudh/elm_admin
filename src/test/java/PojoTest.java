import com.elm.ElmAdminEntry;
import com.elm.po.Admin;
import org.junit.Test;

public class PojoTest {
    @Test
    public void testToString(){
        Admin admin = new Admin();
        System.out.println(admin.toString());
    }
}
