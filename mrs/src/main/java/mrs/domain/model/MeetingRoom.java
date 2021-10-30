package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class MeetingRoom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    private String roomName;
    
}
