package com.module.backend.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.module.shared.entity.RoleEntity;

// Replace.NONE is required to test against real DB
// @Autowired is used to inject instance of RoleRepository
// NB: set EntityScan inside Backend Application to run test
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RoleRepositoryTests {
    @Autowired
    private RoleRepository repo;

    @Test
    public void testCreateFirstRole() {
        RoleEntity superAdmin = new RoleEntity("Super Admin", "Manage Entire System");
        RoleEntity savedRole = repo.save(superAdmin);
        assertThat(savedRole.getId()).isGreaterThan(0);
    }
}
