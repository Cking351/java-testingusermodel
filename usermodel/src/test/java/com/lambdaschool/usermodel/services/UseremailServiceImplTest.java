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

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
public class UseremailServiceImplTest {
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
    public void findAll() {
        assertEquals(5, userService.findAll().size());
    }

    @Test
    public void findUseremailById() {
        assertEquals("test barnbarn", userService.findUserById(11).getUsername());
    }

    @Test
    public void findUseremailByIdNotFound() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void save() {
    }
}