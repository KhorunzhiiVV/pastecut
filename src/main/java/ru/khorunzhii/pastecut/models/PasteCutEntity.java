package ru.khorunzhii.pastecut.models;

import lombok.Data;
import ru.khorunzhii.pastecut.api.request.PublicStatus;

import java.time.LocalDateTime;

@Data
public class PasteCutEntity {
    private String data;
    private String hash;
    private LocalDateTime lifeTime;
    private PublicStatus publicStatus;
}
