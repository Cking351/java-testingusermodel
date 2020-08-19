package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findUserById() {
        assertEquals("test barnbarn", userService.findUserById(11).getUsername());
    }

    @Test(expected = EntityNotFoundException.class)
    public void findUserByIdNotFound() {
        assertEquals("test barnbarn", userService.findUserById(111).getUsername());
    }

    @Test
    public void findByNameContaining() {
        assertEquals(1, userService.findByNameContaining("admin").size());
    }

    @Test
    public void findAll() {
        assertEquals(5, userService.findAll().size());
    }

    @Test
    public void delete() {
    }

    @Test
    public void findByName() {
        assertEquals("test misskitty", userService.findByName("test misskitty").getUsername());
    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteAll() {
    }
}