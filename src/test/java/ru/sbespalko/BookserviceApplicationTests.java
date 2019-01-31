package ru.sbespalko;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookserviceApplicationTests {

    @Test
    public void contextLoads() {
        int s = 10;
        int b = 15;
        int sum = s + b;
        System.out.println("hello");
        System.out.println("sum = " + sum);
    }

    @Test
    public void name1() {
        Stream<String> stream = Stream.of("a1", "a2", "a3");
        stream.map(i -> i.substring(1))
                .mapToInt(Integer::valueOf)
                .map(i -> i * 10)
                .forEach(System.out::println);
    }
}

