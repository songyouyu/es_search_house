package com.imooc.config;

import lombok.Data;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ES 配置
 * @author youyusong
 * @date 2018/9/24
 */
@Data
@Configuration
public class ElasticSearchConfig {

    @Value("${elasticsearch.host}")
    private String esHost;

    @Value("${elasticsearch.port}")
    private Integer esPort;

    @Value("${elasticsearch.cluster.name}")
    private String esName;

    @Bean
    public TransportClient esClient() {
        try {
            //设置settings，默认的cluster.name为elasticsearch
            Settings settings = Settings.builder()
                    .put("cluster.name",esName)
                    .put("client.transport.sniff", true)
                    .build();
            //创建客户端，如果使用默认配置，传参为Settings.EMPTY
            TransportClient client = new PreBuiltTransportClient(settings);

            //创建结点（可以根据情况创建多个结点或者一个结点)
            InetSocketTransportAddress node = new InetSocketTransportAddress(
                    InetAddress.getByName(esHost),Integer.valueOf(esPort));
            client.addTransportAddress(node);

            return client;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Bean
//    public TransportClient esClient() throws UnknownHostException {
//        Settings settings = Settings.builder()
//                .put("cluster.name", esName)
//                .put("client.transport.sniff", true)
//                .build();
//
//        InetSocketTransportAddress master = new InetSocketTransportAddress(
//                InetAddress.getByName(esHost), esPort);
//
//        TransportClient client = new PreBuiltTransportClient(settings)
//                .addTransportAddress(master);
//
//        return client;
//    }
}
