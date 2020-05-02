package com.theretro.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

}
