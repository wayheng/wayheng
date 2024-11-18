package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

/**
 * wayheng-security的security_user_role表实体
 * @author wayheng
 */
@Entity
@Data
public class SecurityUserRoleEntity {

    @Id
    private String id;

    private String userId;

    private String roleId;

    private String createdBy;

    private Timestamp createdAt;

}
