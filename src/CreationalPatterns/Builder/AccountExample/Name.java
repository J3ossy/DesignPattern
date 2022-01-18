package CreationalPatterns.Builder.AccountExample;
import java.util.List;

public class Name {

    private final String firstname;
    private final List<String> middleNames;
    private final String surname;

    private Name(Builder builder) {
        this.firstname = builder.firstname;
        this.middleNames = builder.middleNames;
        this.surname = builder.surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {

        private String firstname;
        private List<String> middleNames;
        private String surname;

        public Builder firstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder middleNames(final List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        public Builder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }
}
