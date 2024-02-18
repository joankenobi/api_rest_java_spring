package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!"; //an attribute no modified, you can call without instances
    private final AtomicLong counter = new AtomicLong(); //an attribute type AtomicLong, can call with instance.

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/joan")
    public Greeting joan(@RequestParam(value="joan", defaultValue = "joan") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template,name)
                );
    }
}
