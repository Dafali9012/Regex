public class Main {
    public static void main(String[] args) {
        System.out.println("phonenumber is valid: "+Validate.phoneNumber("0704-12 34 56"));
        System.out.println("email is valid: "+Validate.email("David_Hitler@Hotmail.com"));
        System.out.println("birthdate is valid: "+Validate.birthdate("19901205-1234"));
        System.out.println("password is valid: "+Validate.password("i2E4S678"));

        System.out.println("\n"+Replace.replace_1());
        System.out.println("\n"+Replace.replace_2());
    }
}
