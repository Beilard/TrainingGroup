package ua.myCompany.lessons.lesson5.solid;

public interface Service {
    //MessageService
    void registration(User user);
    void login(String password, String login);

    //MessageService
    void sendMessage(Message message);
    void getCountries();


}
