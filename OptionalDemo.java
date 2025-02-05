/*
 Create an interface UserService with a default method getWelcomeMessage(), 
 which returns "Welcome, Guest!" if no name is provided. Implement a method 
 getUser(String name) that returns an Optional<String> representing the 
 user's name. In the implementation, if the name is present, return a welcome 
 message with the user's name; otherwise, return the default message.
 
 Hint: Use Optional.ofNullable() and default methods in interfaces.
 */

import java.util.Optional;

interface UserService {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
    Optional<String> getUser(String name);
}
class  Implementation implements UserService {
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
    public String setWelcomeMessage(String name) {
        return getUser(name).map(n -> ("Welcome, "+n+"!")).orElse(getWelcomeMessage());
    }
}
public class OptionalDemo {
    public static void main(String[] args) {
        Implementation ip=new Implementation();
        System.out.println(ip.setWelcomeMessage("Vishal"));
        System.out.println(ip.setWelcomeMessage(null));
    }
}
