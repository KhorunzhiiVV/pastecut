package ru.khorunzhii.pastecut.services;

import ru.khorunzhii.pastecut.api.request.PasteCutRequest;
import ru.khorunzhii.pastecut.api.response.PasteCutResponse;
import ru.khorunzhii.pastecut.api.response.PasteCutUrlResponse;

import java.util.List;

public interface PastecutService {
    PasteCutResponse getByHash(String hash);
    List<PasteCutResponse> getLastPublicPastes(int amount);
    PasteCutUrlResponse create(PasteCutRequest request);
}
