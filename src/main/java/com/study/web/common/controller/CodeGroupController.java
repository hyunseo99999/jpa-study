package com.study.web.common.controller;

import com.study.domain.common.Code;
import com.study.domain.common.CodeGroup;
import com.study.web.common.service.CodeGroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/code-group")
@Slf4j
public class CodeGroupController {

    private final CodeGroupService codeGroupService;

    @PostMapping("/insert.do")
    public CodeGroup insert(@Valid CodeGroup codeGroup) {
        CodeGroup code = codeGroupService.save(codeGroup);
        return code;
    }

    @GetMapping("/findListCodeGrp.do")
    public List<CodeGroup> findListCodeGrp() {
        return codeGroupService.findAll();
    }


}
