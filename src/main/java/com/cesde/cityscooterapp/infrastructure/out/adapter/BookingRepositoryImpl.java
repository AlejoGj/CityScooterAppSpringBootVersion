package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.application.outputports.BookingPersistencePort;
import com.cesde.cityscooterapp.domain.Booking;
import com.cesde.cityscooterapp.infrastructure.out.entities.BookingEntity;
import com.cesde.cityscooterapp.infrastructure.out.mapper.BookingMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.BookingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookingRepositoryImpl implements BookingPersistencePort {

    private BookingRepository bookingRepository;
    private BookingMapper bookingMapper;

    public BookingRepositoryImpl(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    @Override
    public Booking saveBooking(Booking booking) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return null;
    }

    @Override
    public Optional<Booking> findBookingById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Booking> findAllBookings() {
        return List.of();
    }

    @Override
    public void deleteBookingById(int id) {

    }
}
