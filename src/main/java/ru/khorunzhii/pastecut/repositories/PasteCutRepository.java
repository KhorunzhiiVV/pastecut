package ru.khorunzhii.pastecut.repositories;

import ru.khorunzhii.pastecut.models.PasteCutEntity;

import java.util.List;

public interface PasteCutRepository {
    PasteCutEntity getByHash (String hash);

    List<PasteCutEntity> getLastPastes(int amount);

    void add(PasteCutEntity pasteCutEntity);
}
