package com.study.domain.common;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Code {

    @Id @GeneratedValue
    @Column(name = "cd_id")
    private Long id;

    @Column(name = "cd_nm")
    private String cdNm;

    @Column(name = "sort_order")
    private Integer sortOrder;

    private char useyn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cd_grp_id")
    private CodeGroup codeGroup;

    public void setCodeGroup(CodeGroup codeGroup) {
        this.codeGroup = codeGroup;
        // codeGroup.getCode().add(this);
    }

    public Code() {

    }
}
