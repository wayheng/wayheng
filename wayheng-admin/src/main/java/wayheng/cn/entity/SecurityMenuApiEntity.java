package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * wayheng-security的security_menu_api表实体
 * @author wayheng
 */
@Entity
@Data
public class SecurityMenuApiEntity {

    @Id
    private String id;

    private String menuId;

    private String apiId;

    private String createdBy;

    private Timestamp createdAt;

}
