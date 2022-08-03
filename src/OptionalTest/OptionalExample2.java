package OptionalTest;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> listOpt2 = Optional.of(getString().orElse(new String("A")));
        System.out.println(listOpt2.get());

        Optional<String> listOpt3 = Optional.of(getString().orElseGet(() -> new String("B")));
        System.out.println(listOpt3.get());
    }

    private static Optional<String> getString() {
        return Optional.ofNullable(null);
    }
}
