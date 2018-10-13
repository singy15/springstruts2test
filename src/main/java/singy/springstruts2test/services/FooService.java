package singy.springstruts2test.services;

import org.springframework.stereotype.Service;

@Service
public class FooService {
    public String getMessage() {
        return "This is FooService";
    }
}
