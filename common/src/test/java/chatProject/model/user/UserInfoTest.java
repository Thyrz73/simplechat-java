package chatProject.model.user;


import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class UserInfoTest {

    @Test
    public void GetAccountTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        assertEquals("La recuperation de l'account de l'user doit etre le meme",
                user1, user1Info.getAccount());


    }

    @Test
    public void getCurrentStatusTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        Status status = Status.ACTIVE;

        assertEquals("Le user doit avoir le meme status que celui que l'on veut tester car il sont définit pareil",
                status, user1Info.getCurrentStatus());
    }

    @Test
    public void setCurrentStatusTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        assertEquals("Premier status de l'user avant changement", Status.ACTIVE, user1Info.getCurrentStatus());

        Status newStatus = Status.INACTIVE;
        user1Info.setCurrentStatus(newStatus);


        assertEquals("Le test passe si l'user a changer de status", newStatus, user1Info.getCurrentStatus());
    }

    @Test
    public void toStingTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        String shouldBe = "MyUser1(active)"; // Sortie normale de la fonction toString() pour user1Info

        assertEquals("Le test passe si ce qui est retourné est égale a la string attendue",shouldBe, user1Info.toString());
    }


    @Test
    public void hashCodeTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");

        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        int hash = Objects.hash(user1);

        assertEquals("Le test passe si les deux hash sont égaux", hash, user1Info.hashCode());
    }
}
