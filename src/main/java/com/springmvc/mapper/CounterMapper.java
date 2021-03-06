package com.springmvc.mapper;

import com.springmvc.model.Counter;

public interface CounterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    int insert(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    int insertSelective(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    Counter selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Counter record);
}