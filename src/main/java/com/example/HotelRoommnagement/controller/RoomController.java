package com.example.HotelRoommnagement.controller;

import com.example.HotelRoommnagement.model.HotelRoom;
import com.example.HotelRoommnagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    //read
    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms()
    {

        return roomService.getAllRooms();
    }


    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room)
    {
        return roomService.addRoom(room);
    }
}
