package singy.springstruts2test.mappers;

import java.util.List;

import singy.springstruts2test.entities.TSale;


public interface TSaleMapper {
    List<TSale> selectAll();
    void insert(TSale prm);
    List<TSale> selectAllByMap();
}
