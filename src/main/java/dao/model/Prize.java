package dao.model;

public class Prize {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prize.prize_level
     *
     * @mbggenerated
     */
    private String prizeLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prize.prize_size
     *
     * @mbggenerated
     */
    private Integer prizeSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prize.version
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prize.prize_level
     *
     * @return the value of prize.prize_level
     *
     * @mbggenerated
     */
    public String getPrizeLevel() {
        return prizeLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prize.prize_level
     *
     * @param prizeLevel the value for prize.prize_level
     *
     * @mbggenerated
     */
    public void setPrizeLevel(String prizeLevel) {
        this.prizeLevel = prizeLevel == null ? null : prizeLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prize.prize_size
     *
     * @return the value of prize.prize_size
     *
     * @mbggenerated
     */
    public Integer getPrizeSize() {
        return prizeSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prize.prize_size
     *
     * @param prizeSize the value for prize.prize_size
     *
     * @mbggenerated
     */
    public void setPrizeSize(Integer prizeSize) {
        this.prizeSize = prizeSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prize.version
     *
     * @return the value of prize.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prize.version
     *
     * @param version the value for prize.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}