package com.example.authservice_.user;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(1L,
                        "Ismaili1995",
                        "Ismaili",
                        "Lichinga",
                        "ismaili@gmail.com",
                        763080423,
                        27,
                        LocalDate.of(1995, Month.MAY, 04),
                        "Buolamwini1995"));
    }
}
