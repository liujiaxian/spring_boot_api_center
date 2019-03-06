package com.jihuiweb.system.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_api_user")
public class ApiUser {
    @Id
    @Column(name = "api_id")
    private Long apiId;

    @Column(name = "app_id")
    private Long appId;

    @Column(name = "api_key")
    private String apiKey;

    @Column(name = "user_id")
    private Long userId;

    private String name;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "api_type")
    private Integer apiType;

    @Column(name = "created_time")
    private Date createdTime;

    /**
     * @return api_id
     */
    public Long getApiId() {
        return apiId;
    }

    /**
     * @param apiId
     */
    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    /**
     * @return app_id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * @return api_key
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return contact_name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return api_type
     */
    public Integer getApiType() {
        return apiType;
    }

    /**
     * @param apiType
     */
    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}