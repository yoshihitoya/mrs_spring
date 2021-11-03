package mrs.mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;


import mrs.domain.model.ReservableRoom;
import mrs.mrs.domain.repository.room.ReservableRoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoomService {

    @Autowired
    ReservableRoomRepository reservableRoomRepository;

    public List <ReservableRoom> findReservableRooms(LocalDate date) {
        return reservableRoomRepository.findByReservableRoomId_reservedDataOrderByReservableRoomId_roomIdAsc(date);
    }
    
}
