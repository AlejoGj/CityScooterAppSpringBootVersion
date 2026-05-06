package com.cesde.cityscooterapp.application.inputport;

import com.cesde.cityscooterapp.domain.Booking;

import java.util.Optional;

public interface BookingService {

    Booking createBooking(Booking booking);
    Booking stimateDistance(Booking booking);
    Booking stimateElapsedTime(Booking booking);
    Booking stimatePrice(Booking booking);

    Optional <Booking> getBookingById(int id);

    void cancelBooking(int id);
    void changeBookingStatus(int id);


}
