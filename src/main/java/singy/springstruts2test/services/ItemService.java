package singy.springstruts2test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import singy.springstruts2test.entities.TItem;
import singy.springstruts2test.mappers.TItemMapper;

@Service
public class ItemService {
    @Autowired
    private TItemMapper mapper;

    public List<TItem> getAll() {
        return mapper.selectAll();
    }
}
