import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Date birth in format Y_M_D:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year here :");
        int year = scanner.nextInt();

        System.out.println("Enter your month here :");
        int month = scanner.nextInt();

        System.out.println("Enter your day here :");
        int day = scanner.nextInt();

        Calendar.getInstance();
        Calendar userBirthDate = Calendar.getInstance();
        userBirthDate.set(year, month - 1, day);

        Calendar currentDate = Calendar.getInstance();

        int age = currentDate.get(Calendar.YEAR) - userBirthDate.get(Calendar.YEAR);
        if (currentDate.get(Calendar.DAY_OF_YEAR) < userBirthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;

        }
        System.out.println("Age:" + age);
        scanner.close();
    }
}
