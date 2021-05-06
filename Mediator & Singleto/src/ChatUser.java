public class ChatUser extends User {
    public ChatUser(Message message, String name) {
        super(message, name);
        message.addUser(this);
    }

    @Override
    public void sendMess(String massage) {
    System.out.println(this.name + " sends: " + massage);
    message.sendMessage(this ,massage);

    }

    @Override
    public void receiveMessage(String massage) {
        System.out.println(this.name + " receive: " + massage);
    }
    public void kickUser(String massage){
        System.out.println(this.name + " kick: " + massage);
    }
}
