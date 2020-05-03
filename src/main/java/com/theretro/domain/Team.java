package com.theretro.domain;

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
@Table(name = "TEAMS")
public class Team {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "TEAM_ID", length = 40)
    private String teamId;
    @Column(name = "TEAM_NAME", length = 15, nullable = false, unique = true)
    private String teamName;
    @CreatedDate
    @Column(name = "CREATED_ON")
    private Date createdOn;
    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
}
