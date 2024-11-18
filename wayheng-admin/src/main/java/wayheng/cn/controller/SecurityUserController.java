package wayheng.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wayheng.cn.entity.SecurityUserEntity;
import wayheng.cn.repository.SecurityUserRepository;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class SecurityUserController {

    @Resource
    private SecurityUserRepository securityUserRepository;

    @GetMapping("/getAllUsers")
    public List<SecurityUserEntity> getAllUsers() {
        return securityUserRepository.findAll();
    }

    @GetMapping("/createUser")
    public SecurityUserEntity createUser() {
        SecurityUserEntity user = new SecurityUserEntity();
        user.setId("测试ID");
        user.setLastName("");
        user.setFirstName("18号");
        return securityUserRepository.save(user);
    }
}
