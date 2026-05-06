package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.BookingService;
import com.cesde.cityscooterapp.application.outputports.BookingPersistencePort;
import com.cesde.cityscooterapp.domain.Booking;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingPersistencePort bookingPersistencePort;

    public BookingServiceImpl(BookingPersistencePort bookingPersistencePort) {
        this.bookingPersistencePort = bookingPersistencePort;
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingPersistencePort.saveBooking(booking);
    }

    @Override
    public Booking stimateDistance(Booking booking) {
        return null;
    }

    @Override
    public Booking stimateElapsedTime(Booking booking) {
        return null;
    }

    @Override
    public Booking stimatePrice(Booking booking) {
        return null;
    }

    @Override
    public void cancelBooking(int id) {

    }

    @Override
    public void changeBookingStatus(int id) {

    }

    @Override
    public Optional<Booking> getBookingById(int id) {

        Booking booking = bookingPersistencePort.findBookingById(id).stream()
                .filter(b -> b.getIdBooking() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(booking);
    }
}
