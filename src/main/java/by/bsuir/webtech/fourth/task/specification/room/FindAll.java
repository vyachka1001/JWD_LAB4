package by.bsuir.webtech.fourth.task.specification.room;

import by.bsuir.webtech.fourth.task.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindAll implements Specification {

    @Override
    public String toSql() {
        return "";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
