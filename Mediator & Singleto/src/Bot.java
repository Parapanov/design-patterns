public class Bot {
    private static Bot instance;
    protected  Message message;
    private  Bot(){

    }
    public static Bot getInstance(){
        if(instance == null){
            instance = new Bot();
        }
        return instance;
    }
    public void consumeMessage(String message){
        System.out.println("Message From Bot: " + message);
    }
 public  void kickUser(String message){
     System.out.println("Message From Bot: " + message);
     System.out.println("This message is forbidden");
 }
    }

