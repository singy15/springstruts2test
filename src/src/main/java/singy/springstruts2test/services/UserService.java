package singy.springstruts2test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import singy.springstruts2test.entities.MUser;
import singy.springstruts2test.mappers.MUserMapper;


@Component
public class UserService implements IUserService {
    @Autowired
    public MUserMapper mapper;

    public List<MUser> selectAll() {
        return mapper.selectAll();
    }
}
