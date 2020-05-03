package com.theretro.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MEMBERS")
public class Member {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "MEMBER_ID", length = 40, nullable = false)
    private String memberId;
    @Column(name = "NAMES", length = 100, nullable = false)
    private String names;
    @Column(name = "username", length = 15, nullable = false, unique = true)
    private String userName;
    @Column(name = "password", length = 20, nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "member_team_id", nullable = false)
    private Team team;
}
