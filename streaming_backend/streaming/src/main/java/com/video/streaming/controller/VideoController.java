package com.video.streaming.controller;

import com.video.streaming.entity.VideoDetails;
import com.video.streaming.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/videos")
public class VideoController {
    private final VideoService videoService;


    @GetMapping
    public List<VideoDetails> getAllVideos() {
        return videoService.getAllVideos();
    }

    @GetMapping("/{id}")
    public Optional<VideoDetails> getVideoById(@PathVariable String id) {
        return videoService.getVideoById(id);
    }

    @GetMapping("/channel/{channelId}")
    public List<VideoDetails> getVideosByChannel(@PathVariable String channelId) {
        return videoService.getVideosByChannel(channelId);
    }

    @PostMapping
    public VideoDetails createVideo(@RequestBody VideoDetails video) {
        return videoService.createVideo(video);
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable String id) {
        videoService.deleteVideo(id);
    }
}
