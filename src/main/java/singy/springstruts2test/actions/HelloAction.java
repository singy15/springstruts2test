package singy.springstruts2test.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import singy.springstruts2test.services.FooService;

//http://localhost:8080/springstruts2test/hello.action

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport {

    @Autowired
    private FooService service;

    public String execute() throws Exception {
//        setMessage(getText(MESSAGE));
        setMessage(service.getMessage());
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
