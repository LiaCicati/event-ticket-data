package com.eventtickets.datatier.controllers.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEventDTO {
	private String name;
	private String description;
	private String location;
	private String thumbnail;
	private int availableTickets;
	@JsonFormat(pattern = "yyyy-MM-dd_HH:mm")
	private LocalDateTime timeOfTheEvent;
	private double ticketPrice;
	private long organizerId;
}
