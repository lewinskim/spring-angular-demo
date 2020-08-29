package home.tutorials.springangular.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorDetails {

    private final Date timestamp;
    private final String message;
    private final String details;
}
