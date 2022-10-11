package com.calculator;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

  @Test
  void suma(){

    double expectedResult = Calculator.sum(3, 3);
    assertThat(expectedResult).isEqualTo(6);
  }

  @Test
  void sumaFail(){

    double expectedResult = Calculator.sum(3, 3);
    assertThat(expectedResult).isNotEqualTo(4);
  }
}
