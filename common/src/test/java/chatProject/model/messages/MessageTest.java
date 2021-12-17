package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void getId() {
        int id = 42;
        final Message<Object> message = new Message<>(id, null, null);

        assertEquals("The message ID is not the one set in the constructor",
                id, message.getId());
    }

    @Test
    public void getContent() {
        String content = "TEST";
        final Message<String> message = new Message<>(0, null, content);

        assertEquals("The message content is not the one set in the constructor",
                content, message.getMessage());
    }

    @Test
    public void SenderTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);
        final Message<Object> message = new Message<>(1, user1Info, null);

        MessageOwnerConcrete userTest = new MessageOwnerConcrete(user1, Status.ACTIVE);

        assertEquals("Le test passe si la persone qui envoie le message est bien user1Info",
                userTest, message.getSender());
    }

    @Test
    public void getMessageTest(){
        final Message<Object> message = new Message<>(1, null, "Un contenu");

        assertEquals("Le test passe si le contenu du message est bien 'Un contenu'",
                "Un contenu", message.getMessage());
    }

    @Test
    public void toStringTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final int id = 42;

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);
        MessageOwnerConcrete userTest = new MessageOwnerConcrete(user1, Status.ACTIVE);
        final Message<Object> message = new Message<>(id, user1Info, "Un Contenu");

        String expectedString = "Message{id=42, sender="+userTest+", content=Un Contenu}";

        assertEquals("Le test passe si ce qui est retourné est égale à la string attendue",
                expectedString, message.toString());
    }

}