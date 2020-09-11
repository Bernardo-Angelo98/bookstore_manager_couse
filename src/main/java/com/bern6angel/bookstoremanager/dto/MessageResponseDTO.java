package com.bern6angel.bookstoremanager.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
