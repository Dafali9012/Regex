public abstract class Validate {
    public static boolean phoneNumber(String number) {
        return number.matches("(?:([\\- ]?[\\d][\\- ]?){8}|([\\- ]?[\\d][\\- ]?){10})");
    }

    public static boolean email(String email) {
        return email.matches("[^@\n_][^@\n]+@[^@\n]{2,}\\.[A-Za-z]{2,}");
    }

    public static boolean birthdate(String birthdate) {
        return birthdate.matches("(?:[\\d]{4}|[\\d]{2})[- ]?(?:[\\d]{4}|[\\d]{2})[-+ ]?[\\d]{2}[ ]?(?:[\\d]{4}|[\\d]{2})");
    }

    public static boolean password(String password) {
        return password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[a-zA-z\\d]{8,}"); // inga specialtecken än
    }
}
