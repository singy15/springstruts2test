package singy.springstruts2test.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import singy.springstruts2test.entities.MUser;
import singy.springstruts2test.entities.TItem;
import singy.springstruts2test.services.FooService;
import singy.springstruts2test.services.IUserService;
import singy.springstruts2test.services.ItemService;

//http://localhost:8080/springstruts2test/hello.action

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport {

    @Autowired
    private FooService fooService;

    @Autowired
    private IUserService userService;

//    @Autowired
//    private TItemMapper mapper;

    @Autowired
    private ItemService itemService;

    public String execute() throws Exception {
//        setMessage(getText(MESSAGE));
        setMessage(fooService.getMessage());

//        List<TItem> ls = mapper.selectAll();
        List<TItem> lsItem = itemService.getAll();
        for (TItem tItem : lsItem) {
            System.out.println(tItem.toString());
        }

        List<MUser> lsUser = userService.selectAll();
        for (MUser user : lsUser) {
            System.out.println(user.toString());
        }

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
