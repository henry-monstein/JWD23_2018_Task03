package by.epam.task03.dao;

import java.util.List;


public interface XMLDao {
    List<Object> parse(String resourceName) throws XMLDaoException;
}
