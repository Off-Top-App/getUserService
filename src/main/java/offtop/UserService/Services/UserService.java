package offtop.UserService.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import offtop.UserService.Models.User;
import offtop.UserService.Repositories.UserRepository;

@Service
public class UserService{

    @Autowired
    public UserRepository userRepository;

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email).get(0);
    }
    
    public User getUserById(int id){
        User user = userRepository.findById(id);
        System.out.println("age: " + user.getAge());
        return user;
    }

    public User insertUser(User user){
        return userRepository.save(user);   
    }
}