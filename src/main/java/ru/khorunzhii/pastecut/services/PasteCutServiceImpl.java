package ru.khorunzhii.pastecut.services;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import ru.khorunzhii.pastecut.api.request.PasteCutRequest;
import ru.khorunzhii.pastecut.api.response.PasteCutResponse;
import ru.khorunzhii.pastecut.api.response.PasteCutUrlResponse;
import ru.khorunzhii.pastecut.models.PasteCutEntity;
import ru.khorunzhii.pastecut.repositories.PasteCutRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "app")
public class PasteCutServiceImpl implements PastecutService{

    private final PasteCutRepository pasteCutRepository;

    @Override
    public PasteCutResponse getByHash(String hash) {
        PasteCutEntity pasteCutEntity = pasteCutRepository.getByHash(hash);
        return new PasteCutResponse(pasteCutEntity.getData(), pasteCutEntity.getPublicStatus());
    }

    @Override
    public List<PasteCutResponse> getLastPublicPastes(int amount) {
        return null;
    }

    @Override
    public PasteCutUrlResponse create(PasteCutRequest request) {

        return null;
    }
}
