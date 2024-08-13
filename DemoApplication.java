@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/add")
    public String add(
        @RequestParam(value = "a", defaultValue = "0") int a,
        @RequestParam(value = "b", defaultValue = "0") int b
    ) {
        int sum = a + b;
        return String.format("%d + %d = %d", a, b, sum);
    }
}





