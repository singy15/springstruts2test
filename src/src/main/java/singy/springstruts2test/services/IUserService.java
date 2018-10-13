package singy.springstruts2test.services;

import java.util.List;

import singy.springstruts2test.entities.MUser;


public interface IUserService {
    public List<MUser> selectAll();
}
