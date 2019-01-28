package by.epam.task03.dao;


import by.epam.task03.exception.ProjectException;

public class XMLDaoException extends ProjectException {
    private static final long serialVersionUID = 1L;

    public XMLDaoException(String msg) {
        super(msg);
    }

    public XMLDaoException(String msg, Exception e) {
        super(msg, e);
    }
}
