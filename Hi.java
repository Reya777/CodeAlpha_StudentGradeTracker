import java.util.ArrayList;
import java.util.Scanner;

class Hi {
    public String name;
    public double grade;

    public Hi(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        SGT sgt = new SGT();
        sgt.display();
    }
}

class SGT {
    ArrayList<Hi> t = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public void display() {
        while (true) {
            int ch = choiceList();
            switch(ch) {
                case 1:
                    addGradesToList();
                    break;
                case 2:
                    viewGradeList();
                    break;
                case 3:
                    closeTrack();
                    sc.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public int choiceList() {
        System.out.println("\n----> 1. Add Grades:");
        System.out.println("----> 2. List all the Grades");
        System.out.println("----> 3. x...Exit...x\n");
        System.out.println("**** Enter your choice: ****");
        return sc.nextInt();
    }

    public void addGradesToList() {
        System.out.print("Student Name: ");
        sc.nextLine();  // Consume newline
        String name = sc.nextLine();
        System.out.print("Student Grade: ");
        double grade = sc.nextDouble();
        t.add(new Hi(name, grade));
    }

    public void viewGradeList() {
        System.out.println("List of Student names and their grades: ");
        for (Hi st : t) {
            System.out.println(st.getName() + ": " + st.getGrade());
        }
    }

    public void closeTrack() {
        System.out.println("//////// EXITED SUCCESSFULLY \\\\\\\\");
    }
}