import java.util.HashMap;


public class StudentScores {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their scores
        HashMap<String, Integer> scores = new HashMap<>();

        // Adding student names and their scores
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // Retrieving and displaying the score of a specific student
        System.out.println("Score of Bob: " + scores.get("Bob")); // Output: 92

        // Displaying all student scores
        System.out.println("All Student Scores:");
        for (String student : scores.keySet()) {
            System.out.println(student + ": " + scores.get(student));
        }
    }
}
