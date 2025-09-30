package com.video.streaming.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="user_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_id;

    String email;
    String password;
    String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "channel_id", referencedColumnName = "id")
    @JsonManagedReference
    private ChannelDetails channelDetails;

}
