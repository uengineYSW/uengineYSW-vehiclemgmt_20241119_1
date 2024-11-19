package com.posco.assignoperation.s20a01.domain..mybatis;

import lombok.Data;
import java.util.Date;

import com.posco.assignoperation.s20a01.domain.Period;


@Data
public class SearchCarAssignmentMybatisEntity {
        private Date approvalDate;
        private Date requestDate;
        private Period period;
}
