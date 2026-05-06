package com.cesde.cityscooterapp.infrastructure.out.mapper;


import com.cesde.cityscooterapp.domain.Booking;
import com.cesde.cityscooterapp.infrastructure.out.entities.BookingEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking toDomain(BookingEntity bookingentity);
    BookingEntity toEntity(Booking booking);

    List<Booking> toDomain(List<BookingEntity> bookingEntities);

}
