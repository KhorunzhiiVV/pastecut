package ru.khorunzhii.pastecut.repositories;

import org.springframework.stereotype.Repository;
import ru.khorunzhii.pastecut.api.request.PublicStatus;
import ru.khorunzhii.pastecut.exceptions.NotFoundEntityException;
import ru.khorunzhii.pastecut.models.PasteCutEntity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class PasteCutRepositoryImpl implements PasteCutRepository {

    private final Map<String, PasteCutEntity> vault = new ConcurrentHashMap<>();

    @Override
    public PasteCutEntity getByHash(String hash) {
        PasteCutEntity pasteCutEntity = vault.get(hash);

        if(pasteCutEntity == null){
            throw new NotFoundEntityException("Pastecut not found by hash = " + hash);
        }
        return null;
    }

    @Override
    public List<PasteCutEntity> getLastPastes(int amount) {
        LocalDateTime now = LocalDateTime.now();
        return vault.values().stream()
                .filter(pasteCutEntity -> pasteCutEntity.getPublicStatus() == PublicStatus.PUBLIC && pasteCutEntity.getLifeTime().isAfter(now))
                .limit(amount)
                .collect(Collectors.toList());
    }

    @Override
    public void add(PasteCutEntity pasteCutEntity) {
        vault.put(pasteCutEntity.getHash(), pasteCutEntity);
    }
}
