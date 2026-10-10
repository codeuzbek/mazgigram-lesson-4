package dasturlash.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "chat_participant")
public class ChatParticipantEntity { //
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "chat_id")
    private String chatId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id", updatable = false, insertable = false)
    private ChatEntity chat;  // 11

    @Column(name = "profile_id")
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", updatable = false, insertable = false)
    private ProfileEntity profile;

    private Instant lastReadAt; // enables unread counts later
}