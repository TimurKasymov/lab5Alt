package src.interfaces;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public interface CollectionCustom<TEntity> {
    /** validates the list of items*/
    boolean validateData();
    /** returns the LinkedList of TEntity */
    List<TEntity> get();
    /** returns the initialization time of the collection */
    LocalDateTime getInitializationTime();
    /** returns the type of element in the collection */
    Class getElementType();
    /** saves the collection to file */
    void save();
}
