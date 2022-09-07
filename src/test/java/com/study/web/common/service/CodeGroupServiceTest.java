package com.study.web.common.service;

import com.study.domain.common.CodeGroup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback(value = false)
class CodeGroupServiceTest {
    @Autowired
    private CodeGroupService codeGroupService;

    @Test
    void save() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setCodeGrpId("USE_YN");
        codeGroup.setCodeGrpName("사용여부");

        codeGroupService.save(codeGroup);
    }

    @Test
    @DisplayName("코드그룹 중복")
    void findCodeGrpId() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setCodeGrpId("USE_YN");
        codeGroup.setCodeGrpName("사용여부");

        codeGroupService.save(codeGroup);

        CodeGroup codeGroup1 = new CodeGroup();
        codeGroup1.setCodeGrpId("USE_YN");
        codeGroup1.setCodeGrpName("사용여부");

        codeGroupService.save(codeGroup1);
    }

}