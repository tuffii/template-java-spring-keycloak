package ru.tuffi.template_java_spring_keycloak.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tuffi.template_java_spring_keycloak.dto.EventDto;
import ru.tuffi.template_java_spring_keycloak.dto.EventPageDto;
import ru.tuffi.template_java_spring_keycloak.service.EventService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/events")
public class EventRestControllerV1 {

    private final EventService eventService;


    @GetMapping
    public EventPageDto getEvents(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return eventService.getEvents(page, size);
    }

    @PostMapping
    public EventDto createEvent(@RequestBody EventDto dto) {
        return eventService.save(dto);
    }
}
