package com.igortullio.stock_quotes_api;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
public class QuoteDTO {

    @Id
    private Long id;
    private String symbol;
    private Double openValue;
    private Double closeValue;
    private Date timestamp;

}
