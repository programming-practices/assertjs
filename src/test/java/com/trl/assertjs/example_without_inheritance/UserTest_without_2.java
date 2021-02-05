package com.trl.assertjs.example_without_inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest_without_2 {

    private UserA user_A_1;
    private UserA user_A_2;

    private UserB user_B_1;
    private UserB user_B_2;

//############################################################################################# With equals and hashcode
    @Test
    void test_A_1() {

        initData();
        assertThat(user_A_1).usingRecursiveComparison().isNotEqualTo(user_A_2);
    }

    @Test
    void test_A_2() {

        initData();
        assertThat(user_A_1).isNotEqualTo(user_A_2);
    }

//########################################################################################## Without equals and hashcode
    @Test
    void test_B_1() {

        initData();
        assertThat(user_B_1).usingRecursiveComparison().isNotEqualTo(user_B_2);
    }

    @Test
    void test_B_2() {

        initData();
        assertThat(user_B_1).isNotEqualTo(user_B_2);
    }


    private void initData() {
        String firstName = "user_1_firstName";
        String lastName = "user_1_lastName";
        String email = "user_1_email@email";

        user_A_1 = new UserA(firstName, lastName, email);
        user_A_2 = new UserA(firstName, lastName, email);

        user_B_1 = new UserB(firstName, lastName, email);
        user_B_2 = new UserB(firstName, lastName, email);
    }

}

