package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ChatroomTest {

    @Test
    public void getNameTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        final Message<Object> message = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message1 = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message2 = new Message<>(1, user1Info, "Un contenu");

        List<Message>messageList = new List<Message>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Message> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Message message) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Message get(int index) {
                return null;
            }

            @Override
            public Message set(int index, Message element) {
                return null;
            }

            @Override
            public void add(int index, Message element) {

            }

            @Override
            public Message remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Message> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Message> listIterator(int index) {
                return null;
            }

            @Override
            public List<Message> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        Chatroom chatroom = new Chatroom("FirstChat", user1Info, messageList);

        assertEquals("Le Test passe si le nom de la chatroom est bien FirstChat",
                "FirstChat", chatroom.getName());
    }

    @Test
    public void getOwnerTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        final Message<Object> message = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message1 = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message2 = new Message<>(1, user1Info, "Un contenu");

        List<Message>messageList = new List<Message>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Message> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Message message) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Message get(int index) {
                return null;
            }

            @Override
            public Message set(int index, Message element) {
                return null;
            }

            @Override
            public void add(int index, Message element) {

            }

            @Override
            public Message remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Message> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Message> listIterator(int index) {
                return null;
            }

            @Override
            public List<Message> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        Chatroom chatroom = new Chatroom("FirstChat", user1Info, messageList);

        assertEquals("Le test passe si le gerant de la chatroom est bien user1Info",
                user1Info, chatroom.getOwner());
    }

    @Test
    public void getCurrentMessages(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        final Message<Object> message = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message1 = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message2 = new Message<>(1, user1Info, "Un contenu");

        List<Message>messageList = new List<Message>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Message> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Message message) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Message get(int index) {
                return null;
            }

            @Override
            public Message set(int index, Message element) {
                return null;
            }

            @Override
            public void add(int index, Message element) {

            }

            @Override
            public Message remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Message> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Message> listIterator(int index) {
                return null;
            }

            @Override
            public List<Message> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        List<Message> expectedOutput = Collections.unmodifiableList(messageList);
        int sizeToCheck = expectedOutput.size();

        Chatroom chatroom = new Chatroom("FirstChat", user1Info, messageList);

        System.out.println(chatroom.getCurrentMessages());

        assertEquals("Le test passe si ce qui est retrouné fait la meme taille que la liste donnée",
                sizeToCheck, chatroom.getCurrentMessages().size());
    }

    @Test
    public void addMessageTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        final Message<Object> message = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message1 = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message2 = new Message<>(1, user1Info, "Un contenu");

        List<Message>messageList = new List<Message>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Message> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Message message) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Message get(int index) {
                return null;
            }

            @Override
            public Message set(int index, Message element) {
                return null;
            }

            @Override
            public void add(int index, Message element) {

            }

            @Override
            public Message remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Message> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Message> listIterator(int index) {
                return null;
            }

            @Override
            public List<Message> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        Chatroom chatroom = new Chatroom("FirstChat", user1Info, messageList);

        List<Message> listBefore = Collections.unmodifiableList(messageList);
        int idBefore = listBefore.size();


        final Message<Object> messageToTest = new Message<>(idBefore +1  , user1Info, "Un Contenu");

        Message newMessage = chatroom.addMessage(user1Info, "Un Contenu");

        assertEquals("messageToTest doit etre le meme que le message retourné par la fonction",
                messageToTest.getMessage(), newMessage.getMessage() );

    }

    @Test
    public void toStringTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        final Message<Object> message = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message1 = new Message<>(1, user1Info, "Un contenu");
        final Message<Object> message2 = new Message<>(1, user1Info, "Un contenu");

        List<Message>messageList = new List<Message>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Message> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Message message) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Message> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Message get(int index) {
                return null;
            }

            @Override
            public Message set(int index, Message element) {
                return null;
            }

            @Override
            public void add(int index, Message element) {

            }

            @Override
            public Message remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Message> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Message> listIterator(int index) {
                return null;
            }

            @Override
            public List<Message> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        messageList.add(message);
        messageList.add(message1);
        messageList.add(message2);

        Chatroom chatroom = new Chatroom("FirstChat", null, messageList);
        Chatroom chatroom1 = new Chatroom("FirstChat", user1Info, messageList);

        assertEquals("Le test passe si ce que retourne la fonction toString() sans owner définit est égale à FirstChat",
                "FirstChat", chatroom.toString());

        assertEquals("Le test passe si ce que retourne toString() avec un owner definit est égale FirstChat \" (\" + owner.getAccount() + ') ",
                "FirstChat ("+user1Info.getAccount()+")", chatroom1.toString());

    }



}
