package com.example.time;

import java.util.Date;

/*
 *@author jiafeng
 *@date 2019/7/10 0010 14:38
 */
public class DateRangeEntity {
    private Date startDate;

    private Date endDate;

    private int sequence;

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
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
}
