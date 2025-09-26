package com.video.streaming.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChannelDetails {
    @Id
    String Channel_id;
    String ChannelName;
    int totalSubscriber;

    String channelDescription;

}
