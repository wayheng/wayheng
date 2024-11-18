package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * wayheng-security的security_menu表实体
 * @author wayheng
 */
@Entity
@Data
public class SecurityMenuEntity {

    @Id
    private String id;

    /**
     * 上级ID
     */
    private String parentId;

    /**
     * 客户端类型【0：WEB、1：APP、2：其他】
     */
    private Integer clientType;

    /**
     * 菜单类型【0：目录、1：菜单、2：按钮、3：其他】
     */
    private Integer menuType;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单编号
     */
    private String menuCode;

    /**
     * 菜单URI
     */
    private String menuUi;

    /**
     * 排序
     */
    private Integer order;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否启用【0：启用、1：关闭】
     */
    private Integer isEnable;

    /**
     * 是否删除【0：是、1：否】
     */
    private Integer isDelete;

    /**
     * 创建人ID
     */
    private String createdBy;

    /**
     * 最后更新人ID
     */
    private String updatedBy;

    /**
     * 创建时间
     */
    private Timestamp createdAt;

    /**
     * 最后更新时间
     */
    private Timestamp updatedAt;

}
