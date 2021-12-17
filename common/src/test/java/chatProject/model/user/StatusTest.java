package chatProject.model.user;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class StatusTest {

    @Test
    public void getPrintableRepresentationTest(){
        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserInfo user1Info = new UserInfo(user1, Status.ACTIVE);

        String printable = "active";

        assertEquals("Le test passe si ce qui est retourné par getPrintableRepresentation() est égale a la string pritable",
                printable, user1Info.getCurrentStatus().getPrintableRepresentation());
    }
}
