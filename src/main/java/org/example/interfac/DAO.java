package org.example.interfac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public interface DAO <T>{

    public void seed (Collection<T> collection);
    public Boolean create (Class<T> type);
    public Optional<T> read (Integer id);
    public Collection<Object> readAll = new ArrayList<>();
    public Boolean update (Integer id, Class<T> type);
    public Boolean Delete (Integer id);
}