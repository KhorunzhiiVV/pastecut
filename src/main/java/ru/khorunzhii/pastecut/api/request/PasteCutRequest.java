package ru.khorunzhii.pastecut.api.request;

import lombok.Data;

@Data
public class PasteCutRequest {
    private String data;
    private long expirationTimeSeconds;
    private PublicStatus publicStatus;
}
