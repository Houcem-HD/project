package com.example.pfe;

import com.example.pfe.dao.RoleDAO;
import com.example.pfe.dao.UserDAO;
import com.example.pfe.metier.Role;
import com.example.pfe.metier.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class PfeApplication {
    public static void main(String[] args) {

        ApplicationContext cnt;
        cnt = SpringApplication.run(PfeApplication.class, args);

        RoleDAO roleDAO = cnt.getBean(RoleDAO.class);
        UserDAO userDAO = cnt.getBean(UserDAO.class);

        Role r1 = new Role("admin", "admin");
        Role r2 = new Role("user","user");


        roleDAO.save(r1);
        roleDAO.save(r2);

        User u1 = new User(111,"Houcem", "Hdiji",LocalDate.now(),"cons","JEE","houssem.hadiji.hh@gmail.com");
        userDAO.save(u1);



    }

}
