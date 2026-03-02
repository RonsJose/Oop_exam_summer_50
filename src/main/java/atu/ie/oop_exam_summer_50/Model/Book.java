package atu.ie.oop_exam_summer_50.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private long id;

    @PositiveOrZero(message = "Must enter a number >= 0")
    public int roomNumber;

    @Email(message = "Must enter a valid email")
    public String studentEmail;

    @NotBlank(message = "Must enter a date")
    public String bookingDate;

    @PositiveOrZero(message = "Must enter a hour >= 0")
    public int startHour;

    @Positive(message = "Must enter a hour > 0")
    public int durationHours;

}
