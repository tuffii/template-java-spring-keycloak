package ru.tuffi.template_java_spring_keycloak.dto;


import java.util.List;

public record EventPageDto(List<EventDto> content, int page, int size, long totalElements, int totalPages) {
}
