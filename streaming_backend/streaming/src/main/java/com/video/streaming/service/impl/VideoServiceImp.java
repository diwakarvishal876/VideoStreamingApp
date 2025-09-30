package com.video.streaming.service.impl;

import com.video.streaming.Repository.VideoRepository;
import com.video.streaming.entity.VideoDetails;
import com.video.streaming.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class VideoServiceImp implements VideoService {
    private final VideoRepository videoRepository;



    public List<VideoDetails> getAllVideos() {
        return videoRepository.findAll();
    }

    public Optional<VideoDetails> getVideoById(String id) {
        return videoRepository.findById(id);
    }

    public List<VideoDetails> getVideosByChannel(String channelId) {
        return videoRepository.findByChannelDetails_Id(channelId);
    }

    public VideoDetails createVideo(VideoDetails video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(String id) {
        videoRepository.deleteById(id);
    }
}
