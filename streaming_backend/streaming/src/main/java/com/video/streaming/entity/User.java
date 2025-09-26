package com.video.streaming.entity;

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
    String channel_id;

//    Date CTL_UPD_DTM;
//    Date CTL_CRE_DTM;




//    @OneToOne
//    ChannelDetailsService channelDetails;
}
