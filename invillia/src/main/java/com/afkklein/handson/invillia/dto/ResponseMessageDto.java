package com.afkklein.handson.invillia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseMessageDto<T> {

    private T response;
    private int invilliaPort;
    private int s2itport;

}
