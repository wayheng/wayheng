package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * wayheng-security的security_role_menu表实体
 * @author wayheng
 */
@Entity
@Data
public class SecurityRoleMenuEntity {

    @Id
    private String id;

    private String roleId;

    private String menuId;

    private String createdBy;

    private Timestamp createdAt;

}
