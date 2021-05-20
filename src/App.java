import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("whitesheet", "dy", "yc", "goorm");

        name.forEach(System.out::println);  //메서드 레퍼런스 - 리턴값이 없는 경우
        System.out.println("============");
        name.forEach(s -> System.out.println(s));

    }
}
