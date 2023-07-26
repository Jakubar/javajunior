public class Main {
    public static void main(String[] args) {
        int age = 23;
        double height = 1.78;
        double weight = 80;

        double myIndex = weight / (height * height);
        int convertedIndex = (int) myIndex;

        System.out.println("Age: " + age + " Height: " + height + " Weight: " + weight);
        System.out.println("Body Index: " + myIndex + " Converted Index to Int: " + convertedIndex);
    }
}