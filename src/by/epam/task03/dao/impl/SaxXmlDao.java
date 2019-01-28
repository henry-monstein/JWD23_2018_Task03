package by.epam.task03.dao.impl;


import java.util.ArrayList;
import java.util.List;

import by.epam.task03.dao.XMLDao;
import by.epam.task03.dao.XMLDaoException;

public final class SaxXmlDao implements XMLDao {
    private final static SaxXmlDao instance = new SaxXmlDao();

    public static XMLDao getInstance() {
        return instance;
    }

    @Override
    public List<Object> parse(String resourceName) throws XMLDaoException {
        List<Object> list = new ArrayList<>();
        list.add("First string from SAX DAO");
        list.add("Second string from SAX DAO");
        return list;
    }
}
