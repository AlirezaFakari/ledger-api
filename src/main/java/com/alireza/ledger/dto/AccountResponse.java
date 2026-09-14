package com.alireza.ledger.dto;

import java.time.Instant;

public record AccountResponse(Long id, String name, String currency, Instant createdAt) {
}