package com.igortullio.stock_quotes_api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Builder
@Table("quote")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Quote {

    @Id
    private Long id;
    private String symbol;
    private Double openValue;
    private Double closeValue;
    private LocalDateTime timestamp;

}
