/**
 * Class representing a contact book containing information about contacts.
 */
public class ex17 implements ex17interface {

    /** Full name */
    private String name;
    /** Mobile phone */
    private String phone;
    /** Email address */
    private String email;
    /** Telegram username */
    private String telegramUsername;

    /**
     * Sets contact information (full name, mobile phone, email address, Telegram username).
     *
     * @param name             Full name
     * @param phone            Mobile phone
     * @param email            Email address
     * @param telegramUsername Telegram username
     */
    @Override
    public void setContact(String name, String phone, String email, String telegramUsername) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.telegramUsername = telegramUsername;
    }

    /**
     * Default constructor that initializes the fields of the contact book.
     */
    ex17() {
        name = "name1";
        phone = "phone1";
        email = "email1";
        telegramUsername = "telegramUsername1";
    }

    /**
     * Returns the full name of the contact.
     *
     * @return Full name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the mobile phone of the contact.
     *
     * @return Mobile phone
     */
    @Override
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the email address of the contact.
     *
     * @return Email address
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Returns the Telegram username of the contact.
     *
     * @return Telegram username
     */
    @Override
    public String getTelegramUsername() {
        return telegramUsername;
    }

    /**
     * Displays contact information in the console.
     */
    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Telegram Username: " + getTelegramUsername());
    }
}
