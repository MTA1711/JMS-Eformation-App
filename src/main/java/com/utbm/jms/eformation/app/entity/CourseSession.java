/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.jms.eformation.app.entity;

import java.util.Date;

/**
 *
 * @author stéphane
 */
public class CourseSession {
    private Integer courseSessionId;
    private Date startDate;
    private Date endDate;
    private String courseCode;
    private Integer locationId;

    public CourseSession() {
    }
    

    public Integer getCourseSessionId() {
        return courseSessionId;
    }

    public void setCourseSessionId(Integer courseSessionId) {
        this.courseSessionId = courseSessionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
    
    
    
}
