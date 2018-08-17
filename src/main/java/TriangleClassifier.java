public class TriangleClassifier {
    public static void main(String[] args) {
    }

    public static boolean triangleClassifier(int edge_1, int edge_2, int edge_3) {
        if (edge_1 == edge_2 && edge_2 == edge_3) {
            return true;
        } else {
            return false;
        }
    }

}
