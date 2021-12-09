package by.bsuir.webtech.fourth.task.specification.user;

import by.bsuir.webtech.fourth.task.entity.Role;
import by.bsuir.webtech.fourth.task.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindByRole implements Specification {

    private final Role role;

    public FindByRole(Role role) {
        this.role = role;
    }

    @Override
    public String toSql() {
        return "WHERE role = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(role);
    }
}
