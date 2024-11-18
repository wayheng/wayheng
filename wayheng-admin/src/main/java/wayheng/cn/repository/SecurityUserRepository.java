package wayheng.cn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wayheng.cn.entity.SecurityUserEntity;

public interface SecurityUserRepository extends JpaRepository<SecurityUserEntity, String> {
}
