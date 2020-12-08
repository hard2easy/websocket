package com.study.websocket.entity;

import lombok.Data;

@Data
public class Message {
    private Integer id;
    private String  theme;
    private String  content;
    private String  official;
    private String  customer;
}
