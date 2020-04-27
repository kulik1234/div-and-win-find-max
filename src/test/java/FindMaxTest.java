import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {
    @Test
    void shouldFindMax(){
        int a[] = {100,2,5,23,2,59,-5,800};
        assertEquals(7,FindMax.find(a,0,a.length-1));
        int b[] = {1,2,5,-100,23,2,59,-5,8};
        assertEquals(6,FindMax.find(b,0,b.length-1));
        int c[] = {100,2,33,5,23,2,-80,22,59,-5,8};
        assertEquals(0,FindMax.find(c,0,c.length-1));
        int d[] = {-100,-2,-33,-5,-23,-2,-22,-59,-5,-8};
        assertEquals(5,FindMax.find(d,0,d.length-1));
    }
}
