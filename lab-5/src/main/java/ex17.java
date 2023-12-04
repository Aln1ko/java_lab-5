/*
Створити клас записної книжки (поля: ПІБ, мобільний телефон,
 адреса електронної пошти, юзернейм в Телеграм).
 */
/**
 * Клас, який представляє записну книжку з інформацією про контакти.
 */
public class ex17 implements ex17interface {

    /** ПІБ */
    private String name;
    /** Мобільний телефон */
    private String phone;
    /** Адреса електронної пошти */
    private String email;
    /** Юзернейм в Телеграм */
    private String telegramUsername;

    /**
     * Встановлює контактну інформацію (ПІБ, мобільний телефон, адреса електронної пошти, юзернейм в Телеграм).
     *
     * @param name             ПІБ
     * @param phone            мобільний телефон
     * @param email            адреса електронної пошти
     * @param telegramUsername юзернейм в Телеграм
     */
    @Override
    public void setContact(String name, String phone, String email, String telegramUsername) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.telegramUsername = telegramUsername;
    }

    /**
     * Конструктор за замовчуванням, ініціалізує поля записної книжки.
     */
    ex17() {
        name = "name1";
        phone = "phone1";
        email = "email1";
        telegramUsername = "telegramUsername1";
    }

    /**
     * Повертає ПІБ контакту.
     *
     * @return ПІБ
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Повертає мобільний телефон контакту.
     *
     * @return мобільний телефон
     */
    @Override
    public String getPhone() {
        return phone;
    }

    /**
     * Повертає адресу електронної пошти контакту.
     *
     * @return адреса електронної пошти
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Повертає юзернейм в Телеграм контакту.
     *
     * @return юзернейм в Телеграм
     */
    @Override
    public String getTelegramUsername() {
        return telegramUsername;
    }

    /**
     * Виводить інформацію про контакт у консоль.
     */
    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Telegram Username: " + getTelegramUsername());
    }
}
