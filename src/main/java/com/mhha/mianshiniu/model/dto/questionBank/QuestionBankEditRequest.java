package com.mhha.mianshiniu.model.dto.questionBank;

import lombok.Data;

import java.io.Serializable;

/**
 * 编辑题库请求
 *
 * @author Wmhha
 */
@Data
public class QuestionBankEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String picture;

    private static final long serialVersionUID = 1L;
}