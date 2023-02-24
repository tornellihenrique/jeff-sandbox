package io.jeff.sandbox.resource;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestResource {

    private static List<String> names = new ArrayList<>();

    @GetMapping
    public String read() {
        return String.join(", ", names);
    }

    @PostMapping("/{name}")
    public String create(@PathVariable String name) {
        names.add(name);

        return "OK";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name) {
        names.remove(name);

        return "OK";
    }

}
