package com.study.domain.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CD_GRP")
@Getter @Setter
public class CodeGroup {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "cd_grp_id")
    private String codeGrpId;

    @Column(name = "cd_grp_nm")
    private String codeGrpName;

    @Column(name = "cd_grp_desc")
    private String codeGrpDesc;

    @OneToMany(mappedBy = "codeGroup", fetch = FetchType.LAZY)
    private List<Code> code;


    public CodeGroup() {

    }
}
