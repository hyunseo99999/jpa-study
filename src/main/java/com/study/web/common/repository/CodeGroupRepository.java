package com.study.web.common.repository;

import com.study.domain.common.CodeGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupRepository extends JpaRepository<CodeGroup, Long> {

    public CodeGroup findByCodeGrpId(String cdGrpId);

}