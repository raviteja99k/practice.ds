package com.ravi.practice.arrays.sort

import org.junit.Test
import spock.lang.Specification
import spock.lang.Unroll

class InsertionSortSpec extends Specification  {

  @Test
  @Unroll
  def "Sort the given array of numbers #array" (Integer[] array) {
    when:
      InsertionSort<Integer> sorter = new InsertionSort<>(array)
      Integer[] sortedNumbers = sorter.execute();

    and:
      Arrays.sort(array)

    then:
      sortedNumbers == array

    where:
      array << [
      [1, 2, 3, 4, 5, 6, 7, 8, 9],
      [9, 8, 7, 6, 5, 4, 3, 2, 1],
      [6, 3, 7, 4, 9, 2, 8, 1, 5],
      [6, 1, 7, 4, 6, 2, 8, 1, 5]
    ]
  }
}
