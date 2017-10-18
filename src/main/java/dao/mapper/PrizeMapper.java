package dao.mapper;

import dao.model.Prize;
import dao.model.PrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeMapper {

    int update(@Param("record") Prize prize,@Param("oldversion") int oldversion);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int countByExample(PrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int deleteByExample(PrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int insert(Prize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int insertSelective(Prize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    List<Prize> selectByExample(PrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Prize record, @Param("example") PrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prize
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Prize record, @Param("example") PrizeExample example);
}