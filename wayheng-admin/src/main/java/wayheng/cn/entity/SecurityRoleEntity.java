package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * wayheng-security的security_role表实体
 * @author wayheng
 */
@Entity
@Data
public class SecurityRoleEntity {

    @Id
    private String id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色编号
     */
    private String roleCode;

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
