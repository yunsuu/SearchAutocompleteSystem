package com.example.searchautocompletesystem.domain;

import lombok.AllArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
public class UserRequest {
    private final UUID id;
    private final String request;
}
