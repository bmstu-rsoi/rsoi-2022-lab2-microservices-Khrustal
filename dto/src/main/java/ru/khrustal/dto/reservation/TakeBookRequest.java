package ru.khrustal.dto.reservation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TakeBookRequest {
    private UUID bookUid;
    private UUID libraryUid;
    private Date tillDate;
}
