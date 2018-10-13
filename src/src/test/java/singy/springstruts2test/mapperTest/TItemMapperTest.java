package singy.springstruts2test.mapperTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import singy.springstruts2test.entities.TItem;
import singy.springstruts2test.mappers.TItemMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TItemMapperTest {
    @Autowired
    private TItemMapper mapper;

    @Test
    public void canSelectAll() {
        List<TItem> result = mapper.selectAll();

        assert(result != null);
        assertTrue(result.size() > 0);

        result.forEach(System.out::println);
    }
//
//    @Test
//    public void canSelect() {
//        try(SqlSession session = (new SessionFactory()).getSession()) {
//            TItemMapper mapper = session.getMapper(TItemMapper.class);
//
//            TItem condPrice = new TItem();
//            condPrice.setPrice(100);
//            List<TItem> resultPrice = mapper.select(condPrice);
//
//            assert(resultPrice != null);
//            assertTrue(resultPrice.size() > 0);
//
//            resultPrice.forEach(System.out::println);
//
//            TItem condName = new TItem();
//            condName.setName("bbb");
//            List<TItem> resultName = mapper.select(condName);
//
//            assert(resultName != null);
//            assertTrue(resultName.size() > 0);
//
//            resultName.forEach(System.out::println);
//
//            TItem condMult = new TItem();
//            condMult.setName("bbb");
//            condMult.setPrice(200);
//            List<TItem> resultMult = mapper.select(condMult);
//
//            assert(resultMult != null);
//            assertTrue(resultMult.size() > 0);
//
//            resultMult.forEach(System.out::println);
//        }
//    }
//
//    @Test
//    public void canInsertByParam() {
//        try(SqlSession session = (new SessionFactory()).getSession()) {
//            TItemMapper mapper = session.getMapper(TItemMapper.class);
//            Random rnd = new Random();
//            mapper.insertByParam(RandomStringUtils.randomAscii(10), rnd.nextInt(1000));
//            // session.commit();
//        }
//    }
//
//    @Test
//    public void canInsert() {
//        try(SqlSession session = (new SessionFactory()).getSession()) {
//            TItemMapper mapper = session.getMapper(TItemMapper.class);
//            Random rnd = new Random();
//            TItem item = new TItem();
//            item.setName(RandomStringUtils.randomAscii(10));
//            item.setPrice(rnd.nextInt(1000));
//            mapper.insert(item);
//            // session.commit();
//        }
//    }
}
