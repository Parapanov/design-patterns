public interface Message {

    void addUser(User user);
    void addbot(Bot bot);

    void sendMessage(User user , String message);
    void kickUser(Bot bot,User user ,String message);
}
