public class Main {

    public static void main(String[] args) {
        Message chat = new Chat();
        Bot bot = Bot.getInstance();

        bot.consumeMessage("Connect");
        User user1 = new ChatUser(chat, "Тодор");
        User user2 = new ChatUser(chat, "Иванка");
        User user3 = new ChatUser(chat, "Смигал22");

        user1.sendMess("Hi Guy and Girls");
        user2.sendMess("Hi Tod");
        user3.sendMess("Hi Cat");
        user3.sendMess("cat");
        bot.kickUser("Bot kick " + user3.name);
    }
    }

