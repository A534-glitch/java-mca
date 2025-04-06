// Student class to store academic information
class Student {
    int academicScore;

    // Constructor to initialize academic score
    public Student(int academicScore) {
        this.academicScore = academicScore;
    }

    // Method to display academic score
    public void displayAcademicScore() {
        System.out.println("Academic Score: " + academicScore);
    }
}

// Sports class to store sports information
class Sports {
    int sportsScore;

    // Constructor to initialize sports score
    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    // Method to display sports score
    public void displaySportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Result class that inherits from both Student and Sports
class Result extends Student {
    Sports sports;

    // Constructor to initialize academic score and sports score
    public Result(int academicScore, int sportsScore) {
        super(academicScore);
        sports = new Sports(sportsScore);
    }

    // Method to display both academic and sports scores
    public void displayResult() {
        displayAcademicScore();
        sports.displaySportsScore();
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a Result object with academic and sports scores
        Result studentResult = new Result(85, 90);

        // Display the result (academic and sports scores)
        studentResult.displayResult();
    }
}
