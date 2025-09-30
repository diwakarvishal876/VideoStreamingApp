package com.video.streaming.services.impl;

import com.video.streaming.Repository.ChannelRepository;
import com.video.streaming.entity.ChannelDetails;
import com.video.streaming.services.ChannelService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public class ChannelServiceImpl implements ChannelService {

    private final ChannelRepository channelRepository;

    public List<ChannelDetails> getAllChannels() {
        return channelRepository.findAll();
    }

    public Optional<ChannelDetails> getChannelById(String id) {
        return channelRepository.findById(id);
    }

    public ChannelDetails createChannel(ChannelDetails channel) {
        return channelRepository.save(channel);
    }

    public void deleteChannel(String id) {
        channelRepository.deleteById(id);
    }
}
