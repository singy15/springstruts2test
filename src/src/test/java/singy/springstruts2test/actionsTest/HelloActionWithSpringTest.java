package singy.springstruts2test.actionsTest;

import java.util.List;

import org.apache.struts2.StrutsSpringJUnit4TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.opensymphony.xwork2.ActionProxy;

import singy.springstruts2test.actions.HelloAction;
import singy.springstruts2test.entities.TItem;
import singy.springstruts2test.mappers.TItemMapper;

// TODO : WIP can't execute test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
          locations={"classpath:applicationContext.xml",
                     "classpath:applicationContext-*.xml" })
public class HelloActionWithSpringTest extends StrutsSpringJUnit4TestCase<HelloAction> {

    @Autowired private TItemMapper mapper;

    @Test
    public void testAction() throws Exception {
        List<TItem> ls = mapper.selectAll();
        for (TItem tItem : ls) {
            System.out.println(tItem.toString());
        }

//        HelloAction hello = new HelloAction();
//        ActionContext.getContext().getContainer().inject(hello);
//        String result = hello.execute();
//        assertTrue("Expected a success result!",
//                ActionSupport.SUCCESS.equals(result));
//        assertTrue("Expected the default message!",
//                hello.getText(HelloAction.MESSAGE).equals(hello.getMessage()));

         // Actionクラスのインスタンスを取得(=リクエスト情報をStruts2に読ませる)
        ActionProxy proxy = getActionProxy("/springstruts2test/hello.action");


//http://localhost:8080/springstruts2test/hello.action

        // Actionクラスを実行し、result値を取得
        String result = proxy.execute();

        // テスト結果の比較
//        assertEquals(ActionSupport.INPUT, result);
    }
}
