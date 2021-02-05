package com.trl.assertjs.example_with_inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest_with {

    private UserAA user_AA_1;
    private UserAA user_AA_2;

    private UserBB user_BB_1;
    private UserBB user_BB_2;

    //############################################################################################# With equals and hashcode
    @Test
    void test_A_1() {

        initData();
        assertThat(user_AA_1).usingRecursiveComparison().isNotEqualTo(user_AA_2);
    }

    @Test
    void test_A_2() {

        initData();
        assertThat(user_AA_1).isNotEqualTo(user_AA_2);
    }

    //########################################################################################## Without equals and hashcode
    @Test
    void test_B_1() {

        initData();
        assertThat(user_BB_1).usingRecursiveComparison().isNotEqualTo(user_BB_2);
    }

    @Test
    void test_B_2() {

        initData();
        assertThat(user_BB_1).isNotEqualTo(user_BB_2);
    }

    private void initData() {

        user_AA_1 = new UserAA("user_1_firstName", "user_1_lastName", "user_1_email@email");
        user_AA_2 = new UserAA("user_2_firstName", "user_2_lastName", "user_2_email@email");

        user_BB_1 = new UserBB("user_1_firstName", "user_1_lastName", "user_1_email@email");
        user_BB_2 = new UserBB("user_2_firstName", "user_2_lastName", "user_2_email@email");
    }

}
