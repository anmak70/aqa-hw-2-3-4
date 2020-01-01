import java.util.Objects;

public class DataHelper {
    private DataHelper() {}

    public static class AuthInfo {
        private String login;
        private String password;

        public AuthInfo(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof AuthInfo)) return false;
            AuthInfo authInfo = (AuthInfo) o;
            return login.equals(authInfo.login) &&
                    password.equals(authInfo.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(login, password);
        }
    }

    public static AuthInfo getAuthInfo(String login, String password) {
        return new AuthInfo(login, password);
    }


    public static class VerificationCode {
        private String code;

        public VerificationCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof VerificationCode)) return false;
            VerificationCode that = (VerificationCode) o;
            return Objects.equals(code, that.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(code);
        }
    }

    public static VerificationCode getVerificationCode(String verificationCode) {
        return new VerificationCode(verificationCode);
    }
}
