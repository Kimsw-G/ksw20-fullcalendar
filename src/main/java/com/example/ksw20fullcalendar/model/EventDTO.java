package com.example.ksw20fullcalendar.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventDTO {

    private String title;
    private String start;
    private String end;
}
