package homework03.task01;

public class PasswordVerifier {

    public boolean checkPassword(String password) throws PasswordVerifierException {
        if (password.length() < 8) {
            throw new PasswordVerifierException("Пароль должен быть не менее 8 символов.");
        }
        if (!containsNumbers(password)) {
            throw new PasswordVerifierException("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!containsUpperLetters(password)) {
            throw new PasswordVerifierException("Пароль должен содержать хотя бы одну заглавную букву.");
        }
        return true;
    }

    public boolean containsNumbers(String string) {
        for (int i = 0; i < 10; i++) {
            if (string.contains(Integer.toString(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUpperLetters(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
