import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class hello 
{
    public static void main(String[] args) {
        System.out.println("Here ye : important announcement");
        System.out.println("Hello, World!");
        System.out.println("hi bob");
        System.out.println("hi Alice ");
        System.out.println("hi charlie");
        System.out.println("hi denise");
        System.out.println("hi ester");
        System.out.println("bye bye");
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Current Date: " + formattedDate);
    }
}