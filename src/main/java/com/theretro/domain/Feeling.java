package com.theretro.domain;

import com.theretro.domain.enums.FeelingType;
import com.theretro.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FEELINGS")
public class Feeling {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "FEELING_ID")
    private String feelingId;
    @Column(name = "FEELING_INDEX", nullable = false)
    private int index;
    @Enumerated(EnumType.STRING)
    @Column(name = "FEELING_TYPE", length = 12, nullable = false)
    private FeelingType type;
    @Column(name = "FEELING_DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "FEELING_LIKES", nullable = false)
    private int likes;
    @Enumerated(EnumType.STRING)
    @Column(name = "FEELING_STATUS", length = 12, nullable = false)
    private Status status;
    @CreatedDate
    @Column(name = "CREATED_ON")
    private Date createdOn;
    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
}
