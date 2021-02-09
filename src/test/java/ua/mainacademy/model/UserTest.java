package ua.mainacademy.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        User user= User.builder()
                .login("testLogin")
                .build();

        assertEquals("User(login=testLogin, password=null, firstName=null, lastName=null)", user.toString());
    }
}