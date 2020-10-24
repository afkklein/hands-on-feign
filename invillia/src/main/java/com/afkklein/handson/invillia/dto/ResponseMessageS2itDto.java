package com.afkklein.handson.invillia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseMessageS2itDto<T> {

    private T response;
    private int s2itport;

}
