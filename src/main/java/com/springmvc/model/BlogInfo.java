package cap.model;

public class BlogInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_info.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_info.blog_name
     *
     * @mbg.generated
     */
    private String blogName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_info.id
     *
     * @return the value of blog_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_info.id
     *
     * @param id the value for blog_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_info.user_id
     *
     * @return the value of blog_info.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_info.user_id
     *
     * @param userId the value for blog_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_info.blog_name
     *
     * @return the value of blog_info.blog_name
     *
     * @mbg.generated
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_info.blog_name
     *
     * @param blogName the value for blog_info.blog_name
     *
     * @mbg.generated
     */
    public void setBlogName(String blogName) {
        this.blogName = blogName == null ? null : blogName.trim();
    }
}