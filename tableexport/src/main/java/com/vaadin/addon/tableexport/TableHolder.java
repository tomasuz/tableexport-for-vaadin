package com.vaadin.addon.tableexport;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author thomas
 */
public interface TableHolder<T> extends Serializable {

    List<String> getColumnIds();

    String getColumnHeader(String columnId);

    Short getCellAlignment(String columnId);

    boolean isColumnCollapsed(String columnId);
    
    Class<?> getColumnType(String columnId);

    Object getColumnValue(T item, String columnId);
    
    Stream<T> getItems();

    boolean isHierarchical();

    void setHierarchical(final boolean hierarchical);

    Stream<T> getChildren(T rootItem);
    
    Stream<T> getRootItems();
    
}
