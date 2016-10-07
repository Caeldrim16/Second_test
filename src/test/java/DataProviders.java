import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class DataProviders {

    @DataProvider(name = "Data for find")
    public static Iterator<Object[]> forFind() throws Exception {
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{"Специалист по тестированию"});
        return list.iterator();
    }
}
