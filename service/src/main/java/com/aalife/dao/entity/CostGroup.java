package com.aalife.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 * @author brother lu
 * @date 2018-06-05
 */
@Entity
@Table(name = "cost_group")
public class CostGroup {
    @GeneratedValue
    @Id
    @Column(name = "id")
    private Integer groupId;

    @Column(name = "group_name")
    @NotNull
    private String groupName;

    @Column(name = "group_code")
    @NotNull
    private String groupCode;

    @Column(name = "entry_id")
    @NotNull
    private Integer entryId;

    @Column(name = "entry_date")
    @NotNull
    private Date entryDate;

    @Column(name = "delete_id")
    private Integer deleteId;

    @Column(name = "delete_date")
    private Date deleteDate;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    @Override
    public String toString() {
        return "CostGroup{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", entryId=" + entryId +
                ", entryDate=" + entryDate +
                ", deleteId=" + deleteId +
                ", deleteDate=" + deleteDate +
                '}';
    }
}
