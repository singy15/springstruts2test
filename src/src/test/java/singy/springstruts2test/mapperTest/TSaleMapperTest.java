package singy.springstruts2test.mapperTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import singy.springstruts2test.entities.TSale;
import singy.springstruts2test.mappers.TSaleMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TSaleMapperTest {
    @Autowired
    private TSaleMapper mapper;

    @Test
    public void canSelectAll() {
        List<TSale> result = mapper.selectAll();

        assert(result != null);
        assertTrue(result.size() > 0);

        result.forEach(System.out::println);
    }

    @Test
    public void canSelectAllByMap() {
        List<TSale> result = mapper.selectAllByMap();

        assert(result != null);
        assertTrue(result.size() > 0);
        for (TSale sale : result) {
            assertTrue(sale.getCustomerId().equals(sale.getCustomerInfo().getCustomerId()));
        }

        result.forEach(System.out::println);
    }
}
