package Optional;

import java.util.Optional;

/**
 * @author 小武 on 2018/7/20.
 */
public class OptionalOrElseExample {
    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();


        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>"));
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>

    }
}
