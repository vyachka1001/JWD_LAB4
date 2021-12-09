package by.bsuir.webtech.fourth.task.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
