public class Contact {
    String firstName;
    String lastName;
    String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return  lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void validateFirstname () {
        if (this.firstName.isEmpty()) {
            throw new RuntimeException("Last Name Cannot be null or empty");
        }
    }
    
}
