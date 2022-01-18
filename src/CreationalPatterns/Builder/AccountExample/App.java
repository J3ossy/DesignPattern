package CreationalPatterns.Builder.AccountExample;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Name name = new Name.Builder().firstname("Sandro")
                .middleNames(List.of("Ramon"))
                .surname("Sacher")
                .build();

        Address address = new Address.Builder().city("Moehlin")
                .houseNumber(11)
                .street("Examplestreet")
                .zipCode("4313")
                .build();

        Account account = new Account.Builder().address(address)
                .name(name).email("sandro@domain.com")
                .id(1)
                .build();

    }
}

