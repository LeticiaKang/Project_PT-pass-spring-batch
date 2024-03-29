package com.fastcampus.pass.repository.pass;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "bulk_pass")
public class BulkPassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 생성을 DB에 위임합니다. (AUTO_INCREMENT)
    private Long bulkPassSeq;
    private Long packageSeq;
    private String userGroupId;

    @Enumerated(EnumType.STRING)
    private BulkPassStatus status;
    private Integer count;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

    public void setEndedAt(Integer period) {
        if (period == null) {
            return;

        }
        this.endedAt = this.startedAt.plusDays(period);

    }

    public void setEndedAt(LocalDateTime endedAt) {
        this.endedAt = endedAt;

    }

}
