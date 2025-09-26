package com.video.streaming.Repository;

import com.video.streaming.entity.VideoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoDetailsRepository extends JpaRepository<VideoDetails,String> {
}
