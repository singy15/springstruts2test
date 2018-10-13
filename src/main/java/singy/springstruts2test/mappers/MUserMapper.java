package singy.springstruts2test.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import singy.springstruts2test.entities.MUser;

public interface MUserMapper {
    List<MUser> selectAll();

    MUser selectByCd(@Param("cd") String cd);
}
