package com.video.streaming.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VideoDetails")
@Getter
@Setter
@NoArgsConstructor
public class VideoDetails {

    @Id
    private String video_id;

    private String description;
    private String path;
    private String tags;

    @ManyToOne
    @JoinColumn(name = "channel_id", referencedColumnName = "id")
    private ChannelDetails channelDetails;



}
