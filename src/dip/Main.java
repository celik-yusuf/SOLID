package dip;

// DIP = Dependency Inversion Principle (Bağımlılık Ters Çevirme Prensibi )
// Top-level modules should not depend on lower-level modules.
//(Üst seviyeli modüller, alt seviyeli modüllere bağlı olmamalı.)

interface Message {
    void sendMessage();
}

public class Email implements Message {

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        //Send email
    }
}

public class SMS implements Message {

    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        //Send sms
    }
}

public class Notification {

    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender() {
        for (Message message : messages) {
            message.sendMessage();
        }
    }
}



public class Main {
    public static void main(String[] args) {

    }
}
