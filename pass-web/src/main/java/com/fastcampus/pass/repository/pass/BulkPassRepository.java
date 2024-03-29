package com.fastcampus.pass.repository.pass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BulkPassRepository extends JpaRepository<BulkPassEntity, Long> {

    @Query(value = """
                select b from BulkPassEntity b
                order by b.startedAt desc
            """)
    List<BulkPassEntity> findAllOrderByStartedAtDesc();
    // startedAt을 기준으로 내림차순한 데이터 목록 반환(리스트 형태의 BulkPassEntity)
}
