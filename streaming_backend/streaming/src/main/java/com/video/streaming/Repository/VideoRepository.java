package com.video.streaming.Repository;

import com.video.streaming.entity.VideoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<VideoDetails,String> {
    List<VideoDetails> findByChannelDetails_Id(String channelId);
}
