package ua.myCompany.lessons.lesson10;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.*;
import static java.util.Collections.unmodifiableList;

// not optional modifier; for repository it is better to use optional
public class OptionalUser {
    private List<String> ids;

    public void setIds(List<String> ids) {
//        this.ids = (ids == null) ? emptyList() : unmodifiableList(ids);
        this.ids = Objects.isNull(ids) ? emptyList() : unmodifiableList(ids);
    }
}
