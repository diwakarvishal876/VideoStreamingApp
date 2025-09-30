package com.video.streaming.Repository;

import com.video.streaming.entity.ChannelDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelDetailsRepository extends JpaRepository<ChannelDetails,String> {
}
