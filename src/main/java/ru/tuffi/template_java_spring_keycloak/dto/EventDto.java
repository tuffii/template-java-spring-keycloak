package ru.tuffi.template_java_spring_keycloak.dto;


public record EventDto(String uid, EventType type, Long createdAt, Long updatedAt, String description) {
}
