package com.example.sprinbootdemo.util;

import com.example.sprinbootdemo.data.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

     private final RoomRepository roomRepository;
     private final GuestRepository guestRepository;
     private final ReservationRepository reservationRepository;

    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests = guestRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Reservation> reservations = reservationRepository.findAll();
        rooms.forEach(System.out::println);
    }
}
