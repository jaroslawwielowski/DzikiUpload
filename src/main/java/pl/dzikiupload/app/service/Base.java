package pl.dzikiupload.app.service;

import java.io.Serializable;
import java.util.Collection;

public interface Base <D, I extends Serializable > {
    D save (D dto);
    D update (D dto);
    D find (I id);
    Boolean remove(I id);
    Collection<D> getall();
}
