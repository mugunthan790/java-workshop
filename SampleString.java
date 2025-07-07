public class SampleString {

    public static void main(String[] args) {
    String firstName = "mugunthan";
    String lastName = "s";
    String fullName = firstName + " " + lastName;
    String upperCaseFullName = fullName.toUpperCase();

        System.out.println("Full Name (Uppercase): " + upperCaseFullName);
        System.out.println(firstName == lastName);
    
    }
}