package dasturlash.uz.entity;

import dasturlash.uz.enums.ChatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ChatEntity { // conversation - suxbat,gap,krug
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    private ChatType type; // USER/DIRECT or GROUP

//    @Column(name = "group_id")
//    private String groupId;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "group_id", updatable = false, insertable = false)
//    private GroupEntity group;  // null for DIRECT


    //
    //
}