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
    String video_id;

    String Description;

    String path;
    String tags;



}
