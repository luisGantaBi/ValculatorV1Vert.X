package com.calculator;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDateTime;

@JsonPropertyOrder
public class ResultDTO {

  private Integer id;

  private Double result;

  private String date;

  public ResultDTO(Integer id, Double result, String date) {
    this.id = id;
    this.result = result;
    this.date = date;
  }

  public ResultDTO(Double result) {
    this.result = result;
  }

  public Double getResult() {
    return result;
  }

  public String getDate() {
    return date;
  }

  public Integer getId() {
    return id;
  }
}
