package com.video.streaming.dtos.request;

import com.video.streaming.dtos.ChannelDetailsDTO;
import com.video.streaming.dtos.UserDTO;
import com.video.streaming.dtos.VideoDetailsDTO;
import com.video.streaming.entity.ChannelDetails;
import com.video.streaming.entity.User;
import com.video.streaming.entity.VideoDetails;

public class mapToEntity {

    public User mapToUser(UserDTO userDTO){
        User user=new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(user.getPassword());
        return user;
    }

    public VideoDetails mapToVideo(VideoDetailsDTO videoDetailsDTO){
        VideoDetails videoDetails=new VideoDetails();
        videoDetails.setDescription(videoDetailsDTO.getDescription());
        videoDetails.setTags(videoDetails.getTags());

        return videoDetails;
    }

    public ChannelDetails mapToChannelDetails(ChannelDetailsDTO channelDetailsDTO){
        ChannelDetails channelDetails=new ChannelDetails();
        channelDetails.setChannelName(channelDetailsDTO.getChannelName());
        channelDetails.setChannelDescription(channelDetailsDTO.getChannelDescription());

        return channelDetails;
    }
}
