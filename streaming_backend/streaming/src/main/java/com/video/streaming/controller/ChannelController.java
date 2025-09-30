package com.video.streaming.controller;

import com.video.streaming.entity.ChannelDetails;
import com.video.streaming.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/channels")
public class ChannelController {
    private final ChannelService channelService;

    @GetMapping
    public List<ChannelDetails> getAllChannels() {
        return channelService.getAllChannels();
    }

    @GetMapping("/{id}")
    public Optional<ChannelDetails> getChannelById(@PathVariable String id) {
        return channelService.getChannelById(id);
    }

    @PostMapping
    public ChannelDetails createChannel(@RequestBody ChannelDetails channel) {
        return channelService.createChannel(channel);
    }

    @DeleteMapping("/{id}")
    public void deleteChannel(@PathVariable String id) {
        channelService.deleteChannel(id);
    }

}
