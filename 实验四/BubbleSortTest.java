import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort c ;

    @Before
    public void setUp() throws Exception {

        bs = new BubbleSort();
    }

    @After
    public void tearDown() throws Exception {

        bs = null;
    }

    @Test
    public void test1() {
        int []a = {1,0};
        int []b = {0,1};
        assertEquals(a, bs.BubbleSort(b));
    }
    
    @Test
    public void test2() {
        int []a = {5，6，7，8，9};
        int []b = {9，5，8，7，6};
        assertEquals(a, bs.BubbleSort(b));
    }

    @Test
    public void test3() {
        int []a = {-10,0,2,7,9,10};
        int []b = {0,-10,9,2,7,10};
            
        assertEquals(a, bs.BubbleSort(b));
    }

}
