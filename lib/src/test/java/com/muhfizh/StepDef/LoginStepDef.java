package com.muhfizh.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("user mengklik tombol login")
    public void userMengklikTombolLogin() {
        
    }

    @And("user memasukan password dengan {string}")
    public void userMemasukanPasswordDengan(String username) {
        
    }

    @And("user memasukan username dengan {string}")
    public void userMemasukanUsernameDengan(String password) {
        
    }

    @Given("user berada dihalaman login")
    public void userBeradaDihalamanLogin() {
        
    }

    @Then("user menampilkan pesan error {string}")
    public void userMenampilkanPesanError(String pesan) {
    }
}
