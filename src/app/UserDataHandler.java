package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class UserDataHandler {

    public String handleUserData(List<User> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder string = new StringBuilder();

        Stream<User> userData = list.stream();

        Stream<User> filteredData = userData.filter(user ->
                user.getEmail().contains("123"));

        filteredData.forEach(user ->
                string.append(count.getAndIncrement())
                        .append(") ").append(user)
                        .append("\n"));

        return string.toString();
    }
}
