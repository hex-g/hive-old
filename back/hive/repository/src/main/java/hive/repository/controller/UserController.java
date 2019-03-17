package hive.repository.controller;

import hive.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hive.repository.model.User;

@RestController
@RequestMapping("/user")
public class RepositoryController {
  @GetMapping("/{username}")
  public User getUserByUsername(@PathVariable final String username) {
    var user = UserRepository.instance.findUserByUsername(username);

    if (user == null) throw new UserNotFoundException();

    return user;
  }
}
