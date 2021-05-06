import java.util.ArrayList;
import java.util.List;

public class Chat implements Message{
    private Bot bot;
    private List<User> userList;
    private List<Bot> botList;
    public Chat(){
        this.userList = new ArrayList<>();
    }
    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public void addbot(Bot bot) {
        this.botList.add(bot);
    }


    @Override
    public void sendMessage(User user,String message) {
    for(User chatUser: this.userList){
        if(user != chatUser){
            chatUser.receiveMessage(message);

        }

    }
    }

    @Override
    public void kickUser(Bot bot,User user, String message) {
        if(user.message.equals("cat")){
            bot.consumeMessage("Bot Kick" + user);
            bot.consumeMessage("This message is forbidden");
        }
    }
}
