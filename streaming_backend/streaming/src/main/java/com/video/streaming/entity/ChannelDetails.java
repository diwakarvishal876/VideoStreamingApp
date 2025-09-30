package com.video.streaming.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChannelDetails {
    @Id
    private String id;

    private String channelName;
    private int totalSubscriber;
    private String channelDescription;

    @OneToOne(mappedBy = "channelDetails")
    @JsonIgnore  //skip user when serializing ChannelDetails
    private User user;

    @OneToMany(mappedBy = "channelDetails", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<VideoDetails> videos;
}
