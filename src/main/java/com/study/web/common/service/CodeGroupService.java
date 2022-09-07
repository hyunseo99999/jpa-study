package com.study.web.common.service;

import com.study.domain.common.CodeGroup;
import com.study.web.common.dto.CodeGroupDto;
import com.study.web.common.repository.CodeGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CodeGroupService {

    private final CodeGroupRepository codeGroupRepository;

    @Transactional
    public CodeGroup save(CodeGroup codeGroup) {

        CodeGroup findCodeGrp = codeGroupRepository.findByCodeGrpId(codeGroup.getCodeGrpId());
        if (findCodeGrp != null) {
            throw new IllegalStateException("중복된 코드 아이디 입니다.");
        }

        codeGroupRepository.save(codeGroup);
        return codeGroup;
    }

    public List<CodeGroup> findAll() {
        return codeGroupRepository.findAll();
    }

    public CodeGroup findOneCodeGroup(String codeGrpId) {
        return codeGroupRepository.findByCodeGrpId(codeGrpId);
    }

}
