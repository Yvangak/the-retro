package com.theretro.domain;

import com.theretro.domain.enums.FeelingType;
import com.theretro.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
    @Column(name = "FEELING_INDEX")
    private int index;
    @Enumerated(EnumType.STRING)
    @Column(name = "FEELING_TYPE", length = 12)
    private FeelingType type;
    @Column(name = "FEELING_DESCRIPTION", length = 255)
    private String description;
    @Column(name = "FEELING_LIKES")
    private int likes;
    @Enumerated(EnumType.STRING)
    @Column(name = "FEELING_STATUS", length = 12)
    private Status status;
}
