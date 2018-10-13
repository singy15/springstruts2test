package singy.springstruts2test.mapperTest;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import singy.springstruts2test.entities.TCustomer;
import singy.springstruts2test.entities.TItem;
import singy.springstruts2test.entities.TSale;
import singy.springstruts2test.mappers.TCustomerMapper;
import singy.springstruts2test.mappers.TItemMapper;
import singy.springstruts2test.mappers.TSaleMapper;
import singy.springstruts2test.utils.RandomUtil;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TCustomerMapperTest {
    @Autowired
    private TCustomerMapper mapper;

    @Autowired
    private TItemMapper mapperItem;

    @Autowired
    private TSaleMapper mapperSale;

    @Autowired
    PlatformTransactionManager txManager;

    @Test
    public void canSelectAll() {
        List<TCustomer> result = mapper.selectAll();

        assert(result != null);
        assertTrue(result.size() > 0);

        result.forEach(System.out::println);
    }

    @Test
    public void canSelect() {
        TItem condPrice = new TItem();
        condPrice.setPrice(100);
        List<TItem> resultPrice = mapperItem.select(condPrice);

        assert(resultPrice != null);
        assertTrue(resultPrice.size() > 0);

        resultPrice.forEach(System.out::println);

        TItem condName = new TItem();
        condName.setName("bbb");
        List<TItem> resultName = mapperItem.select(condName);

        assert(resultName != null);
        assertTrue(resultName.size() > 0);

        resultName.forEach(System.out::println);

        TItem condMult = new TItem();
        condMult.setName("bbb");
        condMult.setPrice(200);
        List<TItem> resultMult = mapperItem.select(condMult);

        assert(resultMult != null);
        assertTrue(resultMult.size() > 0);

        resultMult.forEach(System.out::println);
    }

    @Test
    public void canInsertByParam() {

        DefaultTransactionDefinition txDefinition = new DefaultTransactionDefinition();
        txDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus txStatus = txManager.getTransaction(txDefinition);

        Random rnd = new Random();
//        mapperItem.insertByParam(RandomStringUtils.randomAscii(10), rnd.nextInt(1000));
//        mapperItem.insertByParam(RandomStringUtils.randomAlphabetic(10), rnd.nextInt(1000));
        mapperItem.insertByParam(RandomUtil.randomAlphabetic(10), rnd.nextInt(1000));
//         session.commit();

//        txManager.rollback(txStatus);
        txManager.commit(txStatus);
    }

    @Test
    public void canInsert() {
        List<TItem> lsItem = mapperItem.selectAll();

        Random rnd = new Random();
        TSale sale = new TSale();
        sale.setItemId(lsItem.get(0).getItemId());
        sale.setCustomerId(1L);
        sale.setAmount(rnd.nextInt(1000));
        mapperSale.insert(sale);
        // session.commit();
    }
}
