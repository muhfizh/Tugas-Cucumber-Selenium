@Cucumber
Feature: Login

  Scenario: user masuk dengan username dan password benar
    Given user berada dihalaman login
    And user memasukan username dengan "standard_user"
    And user memasukan password dengan "secret_sauce"
    When user mengklik tombol login
    Then user menampilkan halaman utama

  Scenario: user masuk dengan username benar dan password salah
    Given user berada dihalaman login
    And user memasukan username dengan "standard_user"
    And user memasukan password dengan "123"
    When user mengklik tombol login
    Then user menampilkan pesan error "Epic sadface: Username and password do not match any user in this service"