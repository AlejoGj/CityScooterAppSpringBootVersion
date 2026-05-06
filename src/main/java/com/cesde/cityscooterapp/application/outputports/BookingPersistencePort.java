package com.cesde.cityscooterapp.application.outputports;

import com.cesde.cityscooterapp.domain.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingPersistencePort {

    Booking saveBooking(Booking booking);
    Booking updateBooking(Booking booking);

    Optional<Booking> findBookingById(int id);
    List <Booking> findAllBookings();

    void deleteBookingById(int id);

}
