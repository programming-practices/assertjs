package com.trl.assertjs.example_with_inheritance;

import com.trl.assertjs.example_without_inheritance.UserA;
import com.trl.assertjs.example_without_inheritance.UserB;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest_with_2 {

    private UserAA user_AA_1;
    private UserAA user_AA_2;

    private UserBB user_BB_1;
    private UserBB user_BB_2;

    //############################################################################################# With equals and hashcode
    @Test
    void test_AA_1() {

        initData();
        assertThat(user_AA_1).usingRecursiveComparison().isNotEqualTo(user_AA_2);
    }

    @Test
    void test_AA_2() {

        initData();
        assertThat(user_AA_1).isNotEqualTo(user_AA_2);
    }

    //########################################################################################## Without equals and hashcode
    @Test
    void test_BB_1() {

        initData();
        assertThat(user_BB_1).usingRecursiveComparison().isNotEqualTo(user_BB_2);
    }

    @Test
    void test_BB_2() {

        initData();
        assertThat(user_BB_1).isNotEqualTo(user_BB_2);
    }

    private void initData() {

        String firstName = "user_1_firstName";
        String lastName = "user_1_lastName";
        String email = "user_1_email@email";

        user_AA_1 = new UserAA(firstName, lastName, email);
        sleep();
        user_AA_2 = new UserAA(firstName, lastName, email);

        user_BB_1 = new UserBB(firstName, lastName, email);
        sleep();
        user_BB_2 = new UserBB(firstName, lastName, email);
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
