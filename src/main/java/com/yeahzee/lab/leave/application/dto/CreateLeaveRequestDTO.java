package com.yeahzee.lab.leave.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 新建请假单请求DTO
 */
@Data
public class CreateLeaveRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    ApplicantDTO applicantDTO;
    String leaveType;
    String startTime;
    String endTime;
    Long duration;
}