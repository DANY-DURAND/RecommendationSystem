public class CosineSimilarity {
    public static double calculateCosineSimilarity(double[] vector1, double[] vector2) {
        double dotProduct = 0.0;
        double normVector1 = 0.0;
        double normVector2 = 0.0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
            normVector1 += Math.pow(vector1[i], 2);
            normVector2 += Math.pow(vector2[i], 2);
        }
        normVector1 = Math.sqrt(normVector1);
        normVector2 = Math.sqrt(normVector2);
        return dotProduct / (normVector1 * normVector2);
    }

    public static void main(String[] args) {
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {4.0, 5.0, 6.0};
        double cosineSimilarity = calculateCosineSimilarity(vector1, vector2);
        System.out.println("Cosine similarity: " + cosineSimilarity);
    }
}
