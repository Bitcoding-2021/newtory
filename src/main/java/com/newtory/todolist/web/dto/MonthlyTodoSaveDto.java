package com.newtory.todolist.web.dto;

import com.newtory.member.domain.Member;
import com.newtory.todolist.domain.FinishStatus;

import java.util.Date;

public class MonthlyTodoSaveDto {

    private Member member;
    private String title;
    private String description;
    private FinishStatus status;
    private Date startDate;
    private Date endDate;

    public MonthlyTodoSaveDto(Member member, String title, String description, FinishStatus status, Date startDate, Date endDate) {
        this.member = member;
        this.title = title;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
