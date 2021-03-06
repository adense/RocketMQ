package com.alibaba.rocketmq.broker.digestlog;

import io.netty.channel.Channel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.common.protocol.header.UpdateConsumerOffsetRequestHeader;


public class UpdateCommitOffsetMoniter {

    private static final Logger log = LoggerFactory.getLogger("UpdateCommitOffsetMoniter");


    public static void printUpdatecommit(Channel channel, UpdateConsumerOffsetRequestHeader requestHeader) {
        if (log.isInfoEnabled()) {
            log.info(
                "client [{}] updateConsumeroffset ConsumerGroup[{}] Topic[{}] QueueId[{}] CommitOffset[{}]",
                requestHeader.getConsumerGroup(), requestHeader.getTopic(), requestHeader.getQueueId(),
                requestHeader.getCommitOffset());
        }
    }
}
