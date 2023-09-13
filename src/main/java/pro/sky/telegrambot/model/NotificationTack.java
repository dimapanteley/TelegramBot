package pro.sky.telegrambot.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Table(name = "notification_task")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class NotificationTack {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskId;
    private long chatId;
    private String textMessage;
    private LocalDateTime dateTime;
}

dfkdfksdkhhbkbkhsabkhsbakdbds