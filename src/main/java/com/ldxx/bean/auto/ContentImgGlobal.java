package com.ldxx.bean.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xianing
 * @since 2021-01-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ContentImgGlobal extends Model {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String imgUrl;

    private String content;

    private String keyWords;

    private String linkToUrl;

    private LocalDateTime time;


}
