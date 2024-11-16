package service;

import java.util.List;

public interface Structure<T> {

    void process(List<T> vertices);
    void process(T vertex, List<T> vertices);

}
