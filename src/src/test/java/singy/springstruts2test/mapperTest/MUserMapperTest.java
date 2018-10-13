package singy.springstruts2test.mapperTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import singy.springstruts2test.entities.MUser;
import singy.springstruts2test.mappers.MUserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MUserMapperTest {

    @Autowired
    private MUserMapper mapper;

    @Test
    public void canSelectAll() {
        List<MUser> result = mapper.selectAll();

        assert(result != null);
        assertTrue(result.size() > 0);

        result.forEach(System.out::println);
    }

    @Test
    public void canSelectByCd() {
        List<MUser> ls = mapper.selectAll();
        MUser info = mapper.selectByCd(ls.get(0).getUserCd());

        assert(info != null);

        System.out.println(info.toString());
    }
}
