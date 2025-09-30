package com.video.streaming.services;

import com.video.streaming.entity.ChannelDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ChannelService {

    public List<ChannelDetails> getAllChannels();

    public Optional<ChannelDetails> getChannelById(String id);

    public ChannelDetails createChannel(ChannelDetails channel) ;

    public void deleteChannel(String id);
}
