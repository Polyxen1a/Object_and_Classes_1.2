public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return "Автор " + firstName + " " + lastName;
    }
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
            if (this == other) {
                return true;
            }
            Author author1 = (Author) other;
            return firstName.equals(author1.firstName) && lastName.equals(author1.lastName);

            public int hashCode () {
                return {
                        java.util.Objects.hash(firstName, lastName);
            }
            }
        }
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}