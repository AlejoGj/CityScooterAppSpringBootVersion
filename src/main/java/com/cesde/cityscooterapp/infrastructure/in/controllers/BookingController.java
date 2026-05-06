package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.application.inputport.BookingService;
import com.cesde.cityscooterapp.domain.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")

public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping("/{id}")
    Booking getBooking(@PathVariable int id) {
        return bookingService.getBookingById(id).orElse(null);
    }

}
