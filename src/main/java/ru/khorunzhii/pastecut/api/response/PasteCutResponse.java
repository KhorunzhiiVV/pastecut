package ru.khorunzhii.pastecut.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.khorunzhii.pastecut.api.request.PublicStatus;

@Data
@RequiredArgsConstructor
public class PasteCutResponse {
    private final String data;
    private final PublicStatus publicStatus;
}
