package wayheng.cn.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * wayheng-security的security_user表实体
 * @author wayheng
 */
@Data
@Entity
@Access(AccessType.FIELD)
@Table(name = "security_user")
public class SecurityUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户名
     */
    @Column(length = 255, nullable = false, unique = true)
    private String userName;

    /**
     * 密码
     */
    @Column(length = 255, nullable = false)
    private String password;

    /**
     * 盐
     */
    @Column(length = 255, nullable = false)
    private String salt;

    /**
     * 展示名称
     */
    @Column(length = 255)
    private String displayName;

    /**
     * 头像URL
     */
    @Column(length = 255)
    private String avatarUri;

    /**
     * 名字
     */
    @Column(length = 255)
    private String firstName;

    /**
     * 姓氏
     */
    @Column(length = 255)
    private String lastName;

    /**
     * 性别【0：女、1：男】
     */
    @Column(length = 255)
    private Integer gender;

    /**
     * 出生日期
     */
    @Column(length = 255)
    private Date birthDate;

    /**
     * 邮箱
     */
    @Column(length = 255)
    private String email;

    /**
     * 电话号码
     */
    @Column(length = 255)
    private String phone;

    /**
     * 国家
     */
    @Column(length = 255)
    private String country;

    /**
     * 州/省
     */
    @Column(length = 255)
    private String state;

    /**
     * 城市
     */
    @Column(length = 255)
    private String city;

    /**
     * 最后登录时间
     */
    @Column(length = 255)
    private Timestamp lastLoginTime;

    /**
     * 账号是否激活【0：是、1：否】
     */
    @Column(length = 255)
    private Integer isActive;

    /**
     * 账号是否为管理员【0：是、1：否】
     */
    @Column(length = 255)
    private Integer isAdmin;

    /**
     * 是否删除【0：是、1：否】
     */
    @Column(length = 255)
    private Integer isDelete;

    /**
     * 创建人ID
     */
    @Column(length = 255)
    private String createdBy;

    /**
     * 最后更新人ID
     */
    @Column(length = 255)
    private String updatedBy;

    /**
     * 创建时间
     */
    @Column(length = 255)
    private Timestamp createdAt;

    /**
     * 最后更新时间
     */
    @Column(length = 255)
    private Timestamp updatedAt;

}
