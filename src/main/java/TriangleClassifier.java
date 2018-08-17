public class TriangleClassifier {
    public static void main(String[] args) {
    }

    public static String triangleClassifier(int edge_1, int edge_2, int edge_3) {
        if (edge_1 == edge_2 && edge_2 == edge_3) {
            return "Equilateral Triangle";
        } else {
            if (edge_1 == edge_2 || edge_1 == edge_3 || edge_2 == edge_3) {
                if (edge_1 == 0 || edge_2 == 0 || edge_3 == 0) {
                    return "Not Triangle";
                }
                return "Isosceles Triangle";
            }
        }
        if (edge_1 + edge_2 > edge_3 && edge_3 + edge_2 > edge_1 && edge_1 + edge_3 > edge_2) {
            return "Triangle";
        } else {
            return "Not Triangle";
        }
    }
}
