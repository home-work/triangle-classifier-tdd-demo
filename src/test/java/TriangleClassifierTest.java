import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void triangleClassifierWith3EdgesAreEqual() {
        int edge_1 = 2;
        int edge_2 = 2;
        int edge_3 = 2;

        String expect = "Equilateral Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
    @Test
    public void triangleClassifierWith2EdgesAreEqual() {
        int edge_1 = 2;
        int edge_2 = 2;
        int edge_3 = 3;

        String expect = "Isosceles Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
    @Test
    public void triangleClassifierWith3DifferentEdges_1() {
        int edge_1 = 3;
        int edge_2 = 4;
        int edge_3 = 5;

        String expect = "Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
    @Test
    public void triangleClassifierWith3DifferentEdges_2() {
        int edge_1 = 8;
        int edge_2 = 2;
        int edge_3 = 3;

        String expect = "Not Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
    @Test
    public void triangleClassifierWith3DifferentEdges_3() {
        int edge_1 = -1;
        int edge_2 = 2;
        int edge_3 = 1;

        String expect = "Not Triangle";
        String actual = TriangleClassifier.triangleClassifier(edge_1, edge_2, edge_3);
        assertEquals(expect,actual);
    }
}
