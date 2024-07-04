package in.raj.service.test;

import in.raj.dao.UserDao;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import in.raj.service.UserService;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

public class UserServiceTest {

    @Test
    public void getNameTest() {

        // creating mock obj
        UserDao userdaoMock = PowerMockito.mock(UserDao.class);

        // defining behaviour for mock obj
        when(userdaoMock.findNameById(101)).thenReturn("Raja");

        // injecting mock dao into service through constructor
        UserService service = new UserService(userdaoMock);

        // calling service method
        String name = service.getName(101);

        // validate the result

        assertEquals("Raja", name);

    }

    @Test
    public void loginTest() {

        // create mock obj
        UserDao userDaoMock = PowerMockito.mock(UserDao.class);

        // define mock obj behaviour
        when(userDaoMock.findByEmailAndPwd("raj@gmail.com", "admin")).thenReturn(true);

        // injecting mock obj into service
        UserService service = new UserService(userDaoMock);

        String status = service.login("raj@gmail.com", "admin");

        assertEquals("SUCCESS", status);
    }
}