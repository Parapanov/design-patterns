public abstract class User {
    protected String name;
    protected  Message message;
    protected Bot bot;
    public User(Message message,String name){
        this.message = message;
        this.name = name;

    }
    public abstract void sendMess(String message);
    public abstract void receiveMessage(String message);
}
