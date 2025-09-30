package com.video.streaming.service;

import com.video.streaming.entity.VideoDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface VideoService {

    public List<VideoDetails> getAllVideos();

    public Optional<VideoDetails> getVideoById(String id) ;

    public List<VideoDetails> getVideosByChannel(String channelId);

    public VideoDetails createVideo(VideoDetails video) ;

    public void deleteVideo(String id);

}
