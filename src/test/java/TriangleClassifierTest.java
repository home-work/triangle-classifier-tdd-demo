import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;

public class TriangleClassifierTest {

    @Test
    @DisplayName("Test value with a=b=c")
    public void triangleClassifierWith3EdgesAreEqual() {
        int edge_1 = 2;
        int edge_2 = 2;
        int edge_3 = 2;

        String expect = "Equilateral Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
    @Test
    @DisplayName("Test value with a=b")
    public void triangleClassifierWith2EdgesAreEqual() {
        int edge_1 = 2;
        int edge_2 = 2;
        int edge_3 = 3;

        String expect = "Isosceles Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
}
