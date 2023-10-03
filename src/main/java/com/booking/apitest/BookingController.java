package com.booking.apitest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookingController {

    // This is a placeholder. In a real-world scenario, you'd fetch this list from a database or some other source.
    private static final List<Booking> bookings = Arrays.asList(
            new Booking("ABC123", "John Doe", 150.0f, "MAN", "2023-01-01", "2023-01-10")
            // Add more bookings as needed
    );

    @GetMapping("/bookings/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable int id) {
        if (id <= 0 || id > bookings.size()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookings.get(id - 1), HttpStatus.OK);
    }
}
